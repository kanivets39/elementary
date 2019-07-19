package task2;

import java.util.Comparator;

class EnvelopeComparator implements Comparator<Envelope> {

	@Override
	public int compare(Envelope o1, Envelope o2) {
		if (((o1.a < o2.a) && (o1.b < o2.b)) || ((o1.a < o2.b) && (o1.b < o2.a)) || ((o2.a < o1.a) && (o2.b < o1.b))
				|| ((o2.a < o1.b) && (o2.b < o1.a))) {
			System.out.println("These envelopes are compatible ");
			return 1;
		} else {
			System.out.println("These envelopes are not compatible ");
			return 0;
		}
	}

}
