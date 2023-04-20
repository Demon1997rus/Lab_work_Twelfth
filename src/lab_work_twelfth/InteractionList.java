package lab_work_twelfth;

import java.util.LinkedList;
import java.util.ListIterator;


public class InteractionList {
	private LinkedList<String> lst = new LinkedList<>();

	public void add(String value) {
		lst.add(value);
	}

	public String toStringForward() {
		String result = "";
		ListIterator<String> itr = lst.listIterator();
		while(itr.hasNext()) {
			result += itr.next() + "--->";
		}
		return result;
	}	

	public String toStringBack() {
		String result = "";
		ListIterator<String> itr = lst.listIterator(lst.size());
		while(itr.hasPrevious()) {
			result += itr.previous() + "--->";
		}
		return result;
	}

	public boolean delete(String value) {
		return lst.remove(value);
	}

	public void clear() {
		lst.clear();
	}

	public boolean find(String value) {
		return lst.contains(value);
	}
}
