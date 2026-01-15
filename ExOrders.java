package terminal;

import terminal.OrderSystem.Order;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static terminal.OrderSystem.*;
import static terminal.OrderSystem.Category.*;

public class ExOrders {

    public static void main(String[] args) {
        queryA();
        queryB();
        queryC();
        queryD();
        queryE();

    }
    private static void queryA(){
        System.out.println("Pedidos por clientes");

        allOrders()
                .stream()
                .collect(groupingBy(o -> o.customer().name(), counting()))
                .forEach((k,v) -> System.out.println(k + " => " + v));
    }

    private static void queryB(){
        System.out.println("Custos por pedido");

        allOrders()
                .stream()
                .collect(
                        groupingBy(
                                Order::id,
                                summingDouble(Order::price)
                        )
                )
                .forEach((k,v) -> System.out.println(k + " => " + v));
    }

    private static void queryC(){
        System.out.println("Nomes dos cliente que compraram brinquedos");

        allOrders()
                .stream()
                .filter(o -> o.products(). stream().anyMatch(p -> p.category() == TOY))
                .map(o -> o.customer().name())
                .distinct()
                .forEach(System.out::println);
    }

    private static void queryD(){
        System.out.println("IDs de pedidos com o preco acima de 500 ordenados por data");

        OrderSystem
                .allOrders()
                .stream()
                .filter(o -> o.price() > 500)
                .sorted(Comparator.comparing(Order::orderDate))
                .mapToLong(Order::id)
                .forEach(System.out::println);

    }

    private static void queryE(){
        System.out.println("Preco total pagos por clientes em todos os pedidos");

        OrderSystem
                .allOrders()
                .stream()
                .collect(
                        groupingBy(
                                o -> o.customer().name()
                                ,summingDouble( Order::price)
                        )
                )
                .forEach((k,v) -> System.out.println(k + " => " + v));
    }
}
