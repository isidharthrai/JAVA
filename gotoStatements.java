public class gotoStatements {
	public static void main(String[] args) {
		label:
			for(int i=0;i<2;i++) {
				System.out.println(i+"  i");
				for(int j=0;j<4;j++) {
					System.out.println(i+j+"  j");
					for(int k=0;k<4;k++) {
						System.out.println(i+j+k+"  k");
						if (i==1) {
							continue label;
						}
					}
				}
			}
		}
	}
/*Created by Sidharth Rai*/