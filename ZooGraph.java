package javaprograms;
import java.util.*;

public class ZooGraph {
    private static final Map<String, List<String>> graph = Map.of(
        "Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"),
        "Reptile House", List.of("Snake Pit"),
        "Bird Sanctuary", List.of("Parrot Pavilion"),
        "Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure")
    );

    public static void main(String[] args) {
        graph.forEach((zone, connections) -> 
            System.out.println(zone + " connects to: " + connections));
    }
}