package offer;

public class No6 {
	class TreeNode{
		char data;
		TreeNode Lchild;
		TreeNode Rchild;
		
		public TreeNode(char data){
			super();
			this.data = data;
		}
		public TreeNode(char data, TreeNode lchild, TreeNode rchild){
			this(data);
			Lchild = lchild;
			Rchild = rchild;
		}
		public char getData() {
			return data;
		}
		public void setData(char data) {
			this.data = data;
		}
		public TreeNode getLchild() {
			return Lchild;
		}
		public void setLchild(TreeNode lchild) {
			Lchild = lchild;
		}
		public TreeNode getRchild() {
			return Rchild;
		}
		public void setRchild(TreeNode rchild) {
			Rchild = rchild;
		}
		
	}
	
	class BiTree{
		TreeNode root;
		public BiTree(String preOrder, String midOrder, int count){
			if(count <= 0){
				return;
			}
			char c = preOrder.charAt(0);
			int i = 0;
			for(; i < count; i++){
				if(midOrder.charAt(i) == c){
					break;
				}
			}
			
			root = new TreeNode(c);
			/*root.setLchild(new BiTree());*/
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
