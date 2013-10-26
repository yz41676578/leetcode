package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import DataStructure.GraphNode;

/**
 * BFS Graph Copy.
 */
public class CopyGraph1 {
	public static GraphNode copyGraphBFS(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		Map<GraphNode, GraphNode> map = new HashMap<GraphNode, GraphNode>();
		
		queue.add(node);
		GraphNode nodeCopy = new GraphNode();
		map.put(node, nodeCopy);
		while(!queue.isEmpty()) {
			GraphNode curOrig = queue.remove();
			List<GraphNode> listOrig = curOrig.list;
			Iterator<GraphNode> iter = listOrig.iterator();
			while(iter.hasNext()) {
				GraphNode tmpOrig = (GraphNode)iter.next();
				if(!map.containsKey(tmpOrig)) {
					GraphNode tmpCopy = new GraphNode();
					map.get(curOrig).list.add(tmpCopy);
					map.put(tmpOrig, tmpCopy);
					queue.add(tmpOrig);
				}
				else {
					map.get(curOrig).list.add(map.get(tmpOrig));
				}
			}
		}
		return map.get(node);
	}
}
