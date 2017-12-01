import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ConfusedThings1 {

	public static void main(String[] args) {
		List<Section> sectionList = new ArrayList<>();
		Section section;

		// Assign the section
		for (int number = 0; number < 10; number++) {
			section = new Section();
			section.setNumber(number);
			sectionList.add(section);
			System.out.println(section + " : " + section.getNumber());
		}

		// Print the section again
		System.out.println();
		for (Section section2 : sectionList) {
			System.out.println(section2 + " : " + section2.getNumber());
		}
	}

	@Getter
	@Setter
	static class Section {
		private int number;
	}
}
