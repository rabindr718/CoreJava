		import java.io.*;
		import java.util.Scanner;
		import java.util.HashSet;
		import java.util.LinkedList;
		import java.util.Queue;
		import java.util.Set;
		import java.util.List;
		import java.util.*;

		class Node{
			int x, y;
			public Node(int x, int y)
			{
				this.x = x;
				this.y = y;
			}
		}

		public class Experiment5
		{
			public static int MAX_CAPACITY_OF_LEFT_JUG, MAX_CAPACITY_OF_RIGHT_JUG, MAX_DEPTH_OF_TREE;
			
			public static Queue<Node> queue;

			public static Set<Node> alreadyEncountered;

			
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Capacity of Two Jugs respectively:");
				System.out.println("The Capacity of the Larger jug should be followed by the capacity of "
						+ "smaller jug and they should not be equal");
				MAX_CAPACITY_OF_LEFT_JUG = sc.nextInt();
				MAX_CAPACITY_OF_RIGHT_JUG = sc.nextInt();
				MAX_DEPTH_OF_TREE = 15;
				System.out.println("Enter the required capacity: ");
				int t = sc.nextInt();
				Node root = new Node(0,0);
				queue = new LinkedList<>();
				queue.add(root);
				alreadyEncountered = new HashSet<>();
				alreadyEncountered.add(root);

				int numberOfNodesTraversed = 0;
				int level = 1;
				boolean flag = false;
				
				while(!queue.isEmpty())
				{
					numberOfNodesTraversed++;

					int tempVariableForChildren = 0;
					Node node = queue.poll();
		System.out.println("("+node.x+","+node.y+")");


					if(node.x == -1 && node.y == -1)
					{
						++level;
						queue.add(new Node(-1, -1));
						continue;
					}

					if(node.x == t && node.y == 0)
					{
						System.out.println("The required capacity can be achieved after" +(level+1)+"move(s)");
						System.out.println("No. of nodes traversed : " +numberOfNodesTraversed);
						break;
					}

					if(level>MAX_DEPTH_OF_TREE)
					{
						System.out.println("The desired capacity was not achieved within a tree depth of "+
					MAX_DEPTH_OF_TREE);
						System.out.println("No. of nodes traversed : " +numberOfNodesTraversed);
						break;
					}

					if(node.x == MAX_CAPACITY_OF_LEFT_JUG && node.y == 0)
					{
						Node newNode = new Node(MAX_CAPACITY_OF_LEFT_JUG,MAX_CAPACITY_OF_RIGHT_JUG);
						
						if(checkIfEncountered(newNode))
							++tempVariableForChildren;
					}
					else if(node.y == MAX_CAPACITY_OF_RIGHT_JUG && node.x == 0)
					{
						Node newNode = new Node(MAX_CAPACITY_OF_RIGHT_JUG,0);
						
						if(checkIfEncountered(newNode))
							++tempVariableForChildren;
					}

					else if(node.x == MAX_CAPACITY_OF_LEFT_JUG && node.y == MAX_CAPACITY_OF_RIGHT_JUG)
					{
						Node newNode1 = new Node(0, MAX_CAPACITY_OF_RIGHT_JUG);
						
						if(checkIfEncountered(newNode1))
							++tempVariableForChildren;

						Node newNode2 = new Node(MAX_CAPACITY_OF_LEFT_JUG, 0);
						
						if(checkIfEncountered(newNode2))
							++tempVariableForChildren;
					}

					else if(node.x != 0 && node.y != 0)
					{
						Node newNode1 = new Node(0, node.y);
						
						if(checkIfEncountered(newNode1))
							++tempVariableForChildren;

						Node newNode2 = new Node(node.x, 0);
						
						if(checkIfEncountered(newNode2))
							++tempVariableForChildren;

						Node newNode3 = new Node(node.x - MAX_CAPACITY_OF_RIGHT_JUG + node.y, MAX_CAPACITY_OF_RIGHT_JUG);

						if(checkIfEncountered(newNode3))
							++tempVariableForChildren;

						Node newNode4 = new Node(MAX_CAPACITY_OF_LEFT_JUG, node.y - MAX_CAPACITY_OF_LEFT_JUG + node.x);

						if(checkIfEncountered(newNode4))
							++tempVariableForChildren;
					}
					
					else if(node.x != 0)
					{
						if(node.x > MAX_CAPACITY_OF_RIGHT_JUG)
						{
							Node newNode = new Node(node.x - MAX_CAPACITY_OF_RIGHT_JUG, MAX_CAPACITY_OF_RIGHT_JUG);

							if(checkIfEncountered(newNode))
								++tempVariableForChildren;	
						}
						else
						{
							Node newNode = new Node(0, node.x);

							if(checkIfEncountered(newNode))
								++tempVariableForChildren;

							Node newNode2 = new Node(MAX_CAPACITY_OF_LEFT_JUG, node.x);

							if(checkIfEncountered(newNode2))
								++tempVariableForChildren;

							Node newNode3 = new Node(node.x, MAX_CAPACITY_OF_RIGHT_JUG);

							if(checkIfEncountered(newNode3))
								++tempVariableForChildren;	
						}
					}

					else if(node.y != 0)
					{
						
						Node newNode = new Node(node.y, 0);

						if(checkIfEncountered(newNode))
							++tempVariableForChildren;	
						
						Node newNode2 = new Node(node.y, MAX_CAPACITY_OF_RIGHT_JUG);

						if(checkIfEncountered(newNode2))
							++tempVariableForChildren;

						Node newNode3 = new Node(MAX_CAPACITY_OF_LEFT_JUG, node.y);

						if(checkIfEncountered(newNode3))
							++tempVariableForChildren;

					}

					else
					{
						Node newNode1 = new Node(MAX_CAPACITY_OF_LEFT_JUG, 0);

						if(checkIfEncountered(newNode1))
							++tempVariableForChildren;

						Node newNode2 = new Node(0, MAX_CAPACITY_OF_RIGHT_JUG);

						if(checkIfEncountered(newNode2))
							++tempVariableForChildren;	
					}


					if(!flag)
					    queue.add(new Node(-1, -1));
					    flag = true;
					
					}


				}

				public static boolean checkIfEncountered(Node node)
				{
					if(!alreadyEncountered.contains(node))
					{
						queue.add(node);
						alreadyEncountered.add(node);
						return true;
					}
					else
					                 return false;
				}

				
		
	}

