package net.devstudy.basic.practics.practic1_controls;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ShowGridVersion3 {

	public static void main(String[] args) {
		int rows = 6;
		int cols = 7;

		for (int i = 0; i < rows * 2 - 1; i++) {
			for (int j = 0; j < cols * 2 - 1; j++) {
				if (j % 2 == 0) {
					System.out.print(i % 2 == 0 ? "   " : "---");
				} else {
					System.out.print(i % 2 == 0 ? "|" : "-");
				}
				//System.out.print(j % 2 == 0 ? (i % 2 == 0 ? "   " : "---") : (i % 2 == 0 ? "|" : "-"));
			}
			System.out.println();
		}
	}

}
