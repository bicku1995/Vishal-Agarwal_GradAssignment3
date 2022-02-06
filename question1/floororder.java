package question1;

public class floororder {
	

		public static queue[] build(int[] FloorSizeArr) {
			int numDays = FloorSizeArr.length;
			queue[] BuildOrder = new queue[numDays];
			int[][] floorplan = new int[numDays][2];
			
			for (int i = 0; i < numDays; i++) {
				floorplan[i][0] = FloorSizeArr[i];
				floorplan[i][1] = i + 1;
				BuildOrder[i] = new queue(numDays);
			}
			
			mergesort.sort(floorplan);
		
			
			int index = 0;
			for (int i = 0; i < numDays; i++) {
				if (floorplan[index][1] < i + 1)
					continue;
				
				while (index < numDays && floorplan[index][1] <= i + 1) {
					BuildOrder[i].insert(floorplan[index][0]);
					index++;
				}
			}
			
			return BuildOrder;
		}
	}


