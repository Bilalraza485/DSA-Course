/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphs;

/**
 *
 * @author Bilal Raza
 */

import java.util.*;

public class Graphs {

    int[][] matrix;

    // Constructor to initialize the matrix with the given number of vertices
    Graphs(int vertix) {
        matrix = new int[vertix][vertix];
    }

    // Method to add an edge between vertices u and v
    public void add(int u, int v) {
        matrix[u - 1][v - 1] = 1;
        matrix[v - 1][u - 1] = 1;
    }

    // Method to display the adjacency matrix
    public void display() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the shortest path using BFS
    public void shortestPath(int start, int destination) {
        // Convert to 0-based index
        start--;
        destination--;

        // Distance array to store the shortest path length from start to each vertex
        int[] dist = new int[matrix.length];
        Arrays.fill(dist, -1); // Initialize distances as -1 (unreachable)
        dist[start] = 0;

        // Parent array to reconstruct the path
        int[] parent = new int[matrix.length];
        Arrays.fill(parent, -1); // -1 indicates no parent

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        // BFS
        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Check all adjacent vertices
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[current][i] == 1 && dist[i] == -1) { // If not visited and there's an edge
                    dist[i] = dist[current] + 1;
                    parent[i] = current;
                    queue.offer(i);

                    // If we have reached the destination, we can stop early
                    if (i == destination) {
                        printPath(parent, start, destination);
                        System.out.println("Length: " + dist[destination]);
                        return;
                    }
                }
            }
        }

        // If no path is found
        System.out.println("No path exists between " + (start + 1) + " and " + (destination + 1));
    }

    // Helper method to reconstruct and print the shortest path
    private void printPath(int[] parent, int start, int destination) {
        if (destination == -1) return;

        LinkedList<Integer> path = new LinkedList<>();
        for (int v = destination; v != start; v = parent[v]) {
            path.addFirst(v + 1); // Add 1 to convert back to 1-based index
        }
        path.addFirst(start + 1);

        // Print the path
        System.out.print("Shortest Path: ");
        for (int vertex : path) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }

     // Method to find all paths between the start and destination vertices using DFS
    public void findAllPaths(int start, int destination) {
        // Convert to 0-based index
        start--;
        destination--;

        // List to store all paths
        List<List<Integer>> allPaths = new ArrayList<>();
        
        // Array to keep track of visited vertices
        boolean[] visited = new boolean[matrix.length];
        
        // Stack to store the current path
        List<Integer> currentPath = new ArrayList<>();
        
        // Start DFS to find all paths
        dfs(start, destination, visited, currentPath, allPaths);
        // Print all paths
        if (allPaths.isEmpty()) {
            System.out.println("No path exists between " + (start + 1) + " and " + (destination + 1));
        } else {
            System.out.println("Paths:");
            for (List<Integer> path : allPaths) {
                System.out.print("Path: ");
                for (int vertex : path) {
                    System.out.print(vertex + " ");
                }
                System.out.println("(Length: " + (path.size() - 1) + ")");
            }
        }
    }

    // Recursive DFS method to find all paths
    private void dfs(int current, int destination, boolean[] visited, List<Integer> currentPath, List<List<Integer>> allPaths) {
        // Mark the current node as visited
        visited[current] = true;
        currentPath.add(current + 1); // Add to the path (convert to 1-based index)
        
        // If we reached the destination, add the path to the list of all paths
        if (current == destination) {
            allPaths.add(new ArrayList<>(currentPath)); // Add a copy of the current path
        } else {
            // Explore all adjacent vertices
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[current][i] == 1 && !visited[i]) { // If there is an edge and the vertex is not visited
                    dfs(i, destination, visited, currentPath, allPaths);
                }
            }
        }

        // Backtrack: unmark the current node and remove it from the current path
        visited[current] = false;
        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.add(1, 2);  // Vertex 1 connected to vertex 2
        g.add(2, 3);  // Vertex 2 connected to vertex 3
        g.add(3, 4);  // Vertex 3 connected to vertex 4
        g.add(4, 1);  // Vertex 4 connected to vertex 1
        g.display();

        // Test shortest path between vertex 1 and 4
        g.shortestPath(1, 4);
        
        // Test finding all paths between vertex 1 and 4
        g.findAllPaths(1, 4);
    }
}
