package ssr.intrvw.prog.designpattern.behavioral.iterator;

public class BookContainer implements IContainer {
	public String[] books = { "Java", "HeadFirst", "BlackBook", "DesignPatter" };

	@Override
	public IIterator createIterator() {
		BookIterator iterator = new BookIterator();
		return iterator;
	}

	public class BookIterator implements IIterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < books.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return books[index++];
			return null;
		}

	}

}
