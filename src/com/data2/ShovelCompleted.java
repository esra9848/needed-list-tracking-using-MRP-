package com.data2;

import java.util.Scanner;

public class ShovelCompleted {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);

		/*********************************************************************************************************************************************************************/

		// ITEM 1605 SHOVEL
		System.out.println("please enter gross requirment of Shovel 1605: ");
		int[] gross_array = new int[10];
		int[] sch_item1605 = new int[10];
		System.out.println("Enter the gross requirment of the 1605 one by one ");
		for (int i = 0; i < 10; i++) {
			gross_array[i] = scanner.nextInt();
		
		}
		System.out.println("Enter Schudeled receipt value ýf item 1605 ");
		for (int i = 0; i < 10; i++) {
			sch_item1605[i] = scanner.nextInt();

		}
		 
		int[][] array1 = { gross_array, sch_item1605, { 30, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		shovel1605 shovel = new shovel1605("shovel", 1, 1, array1[0], array1[1], array1[2], array1[3], array1[4],
				array1[5], array1[6], array1);
		System.out.println("Item : 1605");
		fillTable(shovel);
		System.out.println("**********************************");

		/*********************************************************************************************************************************************************************/

		// ITEM 13122
		int[] sch_item_13122 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 13122");
		for (int i = 0; i < 10; i++) {
			sch_item_13122[i] = scanner.nextInt();
		}
		 
		int[][] array = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_13122, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_13122 item_13122 = new item_13122("item_13122", 1, 40, array[0], array[1], array[2], array[3], array[4],
				array[5], array[6], array);
//		item_13122
		if (item_13122 instanceof shovel1605) {
			item_13122.grossRequirment = shovel.PlannedOrderRelases;
			System.out.println("please enter itmes schudeld recipts value");

			System.out.println("Item : 13122 ");
			fillTable(item_13122);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 048
		int[] sch_item_048 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 048");
		for (int i = 0; i < 10; i++) {
			sch_item_048[i] = scanner.nextInt();
		}
		 
		int[][] array2 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_048, { 30, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_048 item_048 = new item_048("item_48", 3, 30, array2[0], array2[1], array2[2], array2[3], array2[4],
				array2[5], array2[6], array2);

		if (item_048 instanceof shovel1605) {
			System.out.println("Item : 048 ");
			item_048.grossRequirment = shovel.PlannedOrderRelases;
			fillTable(item_048);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 118
		int[] sch_item_118 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 118");
		for (int i = 0; i < 10; i++) {
			sch_item_118[i] = scanner.nextInt();
		}
		 
		int[][] array3 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_118, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_118 item_118 = new item_118("item_118", 2, 1, array3[0], array3[1], array3[2], array3[3], array3[4],
				array3[5], array3[6], array3);

		if (item_118 instanceof shovel1605) {
			System.out.println("Item : 118 ");
			item_118.grossRequirment = shovel.PlannedOrderRelases;
			fillTable(item_118);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 314
		int[] sch_item_314 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 314");
		for (int i = 0; i < 10; i++) {
			sch_item_314[i] = scanner.nextInt();
		}
		 
		int[][] array4 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_314, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_314 item_314 = new item_314("item_314", 1, 50, array4[0], array4[1], array4[2], array4[3], array4[4],
				array4[5], array4[6], array4);

		if (item_314 instanceof shovel1605) {
			System.out.println("Item : 314 ");
			item_314.grossRequirment = shovel.PlannedOrderRelases;
			fillTable(item_314);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 062
		int[] sch_item_062 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 062");
		for (int i = 0; i < 10; i++) {
			sch_item_062[i] = scanner.nextInt();
		}
		 
		int[][] array5 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_062, { 50, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_062 item_062 = new item_062("item_062", 2, 1, array5[0], array5[1], array5[2], array5[3], array5[4],
				array5[5], array5[6], array5);

		if (item_062 instanceof item_13122) {
			System.out.println("Item : 062 ");
			for (int i = 0; i < item_062.PlannedOrderRelases.length; i++) {
				item_062.grossRequirment[i] = item_13122.PlannedOrderRelases[i] * 2 + shovel.PlannedOrderRelases[i] * 4;
				
				
			}
         fillTable(item_062);
         System.out.println("***************************************");
         
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 14127
		int[] sch_item_14127 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 14127");
		for (int i = 0; i < 10; i++) {
			sch_item_14127[i] = scanner.nextInt();
		}
		 
		int[][] array6 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_14127, { 60, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_14127 item_14127 = new item_14127("item 14127", 1, 100, array6[0], array6[1], array6[2], array6[3],
				array6[4], array6[5], array6[6], array6);

		if (item_14127 instanceof item_314) {

			System.out.println("Item : 14127 ");

			for (int i = 0; i < item_14127.PlannedOrderRelases.length; i++) {
				item_14127.grossRequirment[i] = shovel.PlannedOrderRelases[i] * 4 + item_314.PlannedOrderRelases[i] * 6;

			}
			fillTable(item_14127);
			System.out.println("**********************************");

		}

		/*********************************************************************************************************************************************************************/

		// ITEM 11495
		int[] sch_item_11495 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 11495");
		for (int i = 0; i < 10; i++) {
			sch_item_11495[i] = scanner.nextInt();
		}
		 
		int[][] array7 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_11495, { 120, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_11495 item_11495 = new item_11495("item_11495", 1, 50, array7[0], array7[1], array7[2], array7[3],
				array7[4], array7[5], array7[6], array7);

		if (item_11495 instanceof item_13122) {
			System.out.println("Item : 11495 ");
			item_11495.grossRequirment = item_13122.PlannedOrderRelases;
			fillTable(item_11495);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

//		ITEM 129
		int[] sch_item_129 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 129");
		for (int i = 0; i < 10; i++) {
			sch_item_129[i] = scanner.nextInt();
		}
		 
		int[][] array8 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_129, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_129 item_129 = new item_129("item_129", 4, 40, array8[0], array8[1], array8[2], array8[3], array8[4],
				array8[5], array8[6], array8);

		if (item_129 instanceof item_11495) {
			System.out.println("Item : 129 ");
			item_129.grossRequirment = item_11495.PlannedOrderRelases;
			fillTable(item_129);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 019
		int[] sch_item_019 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 019");
		for (int i = 0; i < 10; i++) {
			sch_item_019[i] = scanner.nextInt();
		}
		 
		int[][] array9 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_019, { 50, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_019 item_019 = new item_019("item_019", 2, 50, array9[0], array9[1], array9[2], array9[3], array9[4],
				array9[5], array9[6], array9);

		// item_019
		if (item_019 instanceof item_314) {
			System.out.println("Item : 019	 ");
			item_019.grossRequirment = item_314.PlannedOrderRelases;
			fillTable(item_019);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 2142
		int[] sch_item_2142 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 2142");
		for (int i = 0; i < 10; i++) {
			sch_item_2142[i] = scanner.nextInt();
		}
		 
		int[][] array10 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_2142, { 80, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_2142 item_2142 = new item_2142("item_2142 ", 2, 100, array10[0], array10[1], array10[2], array10[3],
				array10[4], array10[5], array10[6], array10);

		if (item_2142 instanceof item_314) {
			System.out.println("Item : 2142	 ");
			item_2142.grossRequirment = item_314.PlannedOrderRelases;
			fillTable(item_2142);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 1118
		int[] sch_item_1118 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 1118");
		for (int i = 0; i < 10; i++) {
			sch_item_1118[i] = scanner.nextInt();
		}
		 
		int[][] array11 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_1118, { 30, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_1118 item_1118 = new item_1118("item_1118", 3, 1, array11[0], array11[1], array11[2], array11[3],
				array11[4], array11[5], array11[6], array11);

		if (item_1118 instanceof item_11495) {
			System.out.println("Item : 1118 ");
			item_1118.grossRequirment = item_11495.PlannedOrderRelases;
			fillTable(item_1118);
			System.out.println("**********************************");
		}

		/*********************************************************************************************************************************************************************/

		// ITEM 457
		int[] sch_item_457 = new int[10];
		System.out.println("Enter Scheduled receipt value of item 457");
		for (int i = 0; i < 10; i++) {
			sch_item_457[i] = scanner.nextInt();
		}
		 
		int[][] array12 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, sch_item_457, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		item_457 item_457 = new item_457("item_48", 2, 1, array12[0], array12[1], array12[2], array12[3], array12[4],

				array12[5], array12[6], array12);

		if (item_457 instanceof item_13122) {
			System.out.println("Item : 457 ");
			item_457.grossRequirment = item_13122.PlannedOrderRelases;
			fillTable(item_457);
			System.out.println("**********************************");
		}
		    
          System.out.println(".............End of the program................");
	}
	

	/*********************************************************************************************************************************************************************/

	public static <T> void fillTable(shovel1605 obj) {

		for (int i = 0; i < 10; i++) {
//			101
			if (obj.grossRequirment[i] != 0 && obj.ScheduledReceipts[i] == 0 && obj.OnHandFromPriorPeriod[i] != 0) {// 1.
																													// if
				if (obj.OnHandFromPriorPeriod[i] > obj.grossRequirment[i]) { // 2. if
					obj.NetRequirements[i] = 0;
					obj.OnHandFromPriorPeriod[i + 1] = obj.OnHandFromPriorPeriod[i] - obj.grossRequirment[i];
					obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
					if (obj.Q == 1) {// 3. if
						obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
								i - obj.LT)];
						obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
					} else {// 3. if in else i
						int j = 0;
						while (j < obj.TimePhasedNetRequirements[Math.abs(i - obj.LT)]) {
							j += obj.Q;

							if (j >= obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) { // 4. if
								obj.PlannedOrderDelivery[Math.max(0, i - obj.LT)] = j;
								obj.PlannedOrderDelivery[i] = obj.PlannedOrderRelases[Math.max(0, i - obj.LT)];
								break;
							}
						}
					}
					continue;
				} else {// 2. if in elsi

					obj.NetRequirements[i] = obj.grossRequirment[i] - obj.OnHandFromPriorPeriod[i];
					obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
					if (obj.Q == 1) {
						obj.OnHandFromPriorPeriod[i + 1] = 0;
						obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
								i - obj.LT)];
						obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
					} else {
						int j = 0;
						while (j < obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {
							j += obj.Q;
							if (j >= obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {

								obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = j;
								obj.PlannedOrderDelivery[i] = obj.PlannedOrderRelases[Math.max(0, i - obj.LT)];
								obj.OnHandFromPriorPeriod[i + 1] += obj.PlannedOrderDelivery[i]
										+ obj.OnHandFromPriorPeriod[i] - obj.grossRequirment[i];
								break;
							} else {
								continue;
							}

						}
					}
					continue;

				}

			}

			else if (obj.grossRequirment[i] != 0 && obj.ScheduledReceipts[i] != 0
					&& obj.OnHandFromPriorPeriod[i] == 0) {
				if (obj.ScheduledReceipts[i] > obj.grossRequirment[i]) {
					obj.NetRequirements[i] = 0;
					obj.OnHandFromPriorPeriod[i + 1] += obj.ScheduledReceipts[i] - obj.grossRequirment[i];
					obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
					obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
							i - obj.LT)];
					obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];

					continue;
				} else {
					obj.NetRequirements[i] = obj.grossRequirment[i] - obj.ScheduledReceipts[i];
					obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
					if (obj.Q == 1) {
						obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
								i - obj.LT)];
						obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
						continue;
					}

					else {
						int j = 0;
						while (j < obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {
							j += obj.Q;
							if (j >= obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {
								obj.PlannedOrderRelases[i - obj.LT] = j;
								obj.PlannedOrderDelivery[i] = obj.PlannedOrderRelases[i - obj.LT];
								obj.OnHandFromPriorPeriod[i + 1] += obj.PlannedOrderDelivery[i]
										- obj.NetRequirements[i];
								break;
							} else {
								continue;
							}
						}

					}

				}
				continue;
			}

			else if (obj.grossRequirment[i] == 0 && obj.ScheduledReceipts[i] == 0
					&& obj.OnHandFromPriorPeriod[i] == 0) {

				obj.OnHandFromPriorPeriod[i] = 0;
				obj.NetRequirements[i] = 0;
				obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
				obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
						i - obj.LT)];
				obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
				continue;

			} else if (obj.grossRequirment[i] == 0 && obj.ScheduledReceipts[i] == 0
					&& obj.OnHandFromPriorPeriod[i] != 0) {
				obj.OnHandFromPriorPeriod[Math.min(9, i + 1)] = obj.OnHandFromPriorPeriod[i];
				obj.NetRequirements[i] = 0;
				obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
				obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
						i - obj.LT)];
				obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
				continue;

			} else if (obj.grossRequirment[i] != 0 && obj.ScheduledReceipts[i] == 0
					&& obj.OnHandFromPriorPeriod[i] == 0) {
				obj.NetRequirements[i] = obj.grossRequirment[i];
				obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
				if (obj.Q == 1) {
					obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
							i - obj.LT)];
					obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
					obj.OnHandFromPriorPeriod[Math.min(9, i + 1)] = 0;
				} else {
					int j = 0;
					while (j < obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {
						j += obj.Q;
						if (j >= obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)]) {
							obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = j;
							obj.PlannedOrderDelivery[i] = obj.PlannedOrderRelases[Math.max(0, i - obj.LT)];
							obj.OnHandFromPriorPeriod[i + 1] = obj.PlannedOrderDelivery[i] - obj.grossRequirment[i];
							break;
						} else
							continue;

					}
				}
				continue;
			} else if (obj.grossRequirment[i] == 0 && obj.ScheduledReceipts[i] != 0
					&& obj.OnHandFromPriorPeriod[i] == 0) {
				obj.OnHandFromPriorPeriod[i + 1] = obj.ScheduledReceipts[i];
				obj.NetRequirements[i] = 0;
				obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
				obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
						i - obj.LT)];
				obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
				continue;
			} else if (obj.grossRequirment[i] == 0 && obj.ScheduledReceipts[i] != 0
					&& obj.OnHandFromPriorPeriod[i] != 0) {
				obj.NetRequirements[i] = 0;
				obj.OnHandFromPriorPeriod[i + 1] = obj.ScheduledReceipts[i] + obj.OnHandFromPriorPeriod[i];
				obj.TimePhasedNetRequirements[Math.max(0, i - obj.LT)] = obj.NetRequirements[i];
				obj.PlannedOrderRelases[Math.max(0, i - obj.LT)] = obj.TimePhasedNetRequirements[Math.max(0,
						i - obj.LT)];
				obj.PlannedOrderDelivery[i] = obj.NetRequirements[i];
				continue;
			} else {
				continue;
			}

		} // end of for loop
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.grossRequirment[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.ScheduledReceipts[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.OnHandFromPriorPeriod[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.NetRequirements[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.TimePhasedNetRequirements[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.PlannedOrderRelases[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(obj.PlannedOrderDelivery[i] + " ");

		}
		System.out.println();

	}
}

class shovel1605 {
	String ID;
	int Q;
	int LT;

	public int[] grossRequirment;
	public int[] ScheduledReceipts;
	public int[] OnHandFromPriorPeriod;
	public int[] NetRequirements;
	public int[] TimePhasedNetRequirements;
	public int[] PlannedOrderRelases;
	public int[] PlannedOrderDelivery;
	public int[][] array = { grossRequirment, ScheduledReceipts, OnHandFromPriorPeriod, NetRequirements,
			TimePhasedNetRequirements, PlannedOrderRelases, PlannedOrderDelivery };

	public shovel1605(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		ID = iD;
		Q = q;
		LT = lT;
		this.grossRequirment = grossRequirment;
		this.ScheduledReceipts = scheduledReceipts;
		this.OnHandFromPriorPeriod = onHandFromPriorPeriod;
		this.NetRequirements = netRequirements;
		this.TimePhasedNetRequirements = timePhasedNetRequirements;
		this.PlannedOrderRelases = plannedOrderRelases;
		this.PlannedOrderDelivery = plannedOrderDelivery;
		this.array = array;
	}

}

class item_13122 extends shovel1605 {

	public item_13122(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub

	}
}

class item_048 extends shovel1605 {

	public item_048(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_118 extends shovel1605 {

	public item_118(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_062 extends item_13122 {

	public item_062(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_314 extends shovel1605 {

	public item_314(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_457 extends item_13122 {

	public item_457(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_11495 extends item_13122 {

	public item_11495(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_129 extends item_11495 {

	public item_129(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_1118 extends item_11495 {

	public item_1118(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_2142 extends item_314 {

	public item_2142(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_14127 extends item_314 {

	public item_14127(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}

class item_019 extends item_314 {

	public item_019(String iD, int lT, int q, int[] grossRequirment, int[] scheduledReceipts,
			int[] onHandFromPriorPeriod, int[] netRequirements, int[] timePhasedNetRequirements,
			int[] plannedOrderRelases, int[] plannedOrderDelivery, int[][] array) {
		super(iD, lT, q, grossRequirment, scheduledReceipts, onHandFromPriorPeriod, netRequirements,
				timePhasedNetRequirements, plannedOrderRelases, plannedOrderDelivery, array);
		// TODO Auto-generated constructor stub
//		super.OnHandFromPriorPeriod = grossRequirment;
	}

}
