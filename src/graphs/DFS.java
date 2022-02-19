 package graphs;

import java.util.ArrayList;
import java.util.Stack;



public class DFS {
int V;//vertices
ArrayList<Integer>[] adj;
DFS(int noOfVertex)
{
	V=noOfVertex;
  adj=new ArrayList[noOfVertex];
  for(int i=0;i<noOfVertex;i++)
  {
	  adj[i]=new ArrayList<>();
  }
}
void edge(int x, int y)
{
adj[x].add(y);	
}
void depthFirstSearch(int sourcevertex)
{
boolean[] visited=new boolean[V];
Stack<Integer> s1=new Stack<>();
s1.push(sourcevertex);
int node;
while(!s1.empty())
{
  sourcevertex=s1.peek();
  s1.pop();
for(int i=0;i<adj[sourcevertex].size();i++) 
{
node= adj[sourcevertex].get(i);
if(!visited[node])
{
s1.push(node);
}
}
if(visited[sourcevertex]==false)
{
	System.out.print(sourcevertex +" ");
	visited[sourcevertex]=true;
}
}
}
public static void main(String[] args) {
	DFS d1=new DFS(6);
	d1.edge(0, 1);
	d1.edge(0, 2);
	d1.edge(1, 0);
	d1.edge(1, 2);
	d1.edge(1, 3);
	d1.edge(1, 4);
	d1.edge(2, 0);
	d1.edge(2, 1);
	d1.edge(2, 3);
	d1.edge(2, 4);
	d1.edge(3, 2);
	d1.edge(4, 2);
	d1.edge(4, 5);
	d1.edge(5, 0);
	d1.edge(5, 4);
	System.out.println("Result");
    d1.depthFirstSearch(0);
}
}
