package com.coderscampus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	private static void generate50Numbers(CustomList<Integer> sut) {
		for (int i = 1; i < 51; i++) {
			sut.add(i);
		}
	}

	@Test
	void testAdd_AddOneItemAtBeginning() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.add(0, 15);

		// (expected results, actual results)
		assertEquals(15, sut.get(0));
		assertEquals(51, sut.getSize());
	}

	@Test
	void testAdd_AddItemInTheEnd() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.add(49, 60);
		// (expected results, actual results)
		assertEquals(60, sut.get(49));
		assertEquals(51, sut.getSize());
		System.out.println("List contents:");
//		for (int i = 0; i < sut.getSize(); i++) {
//			System.out.println("Index " + i + ": " + sut.get(i));
//		}
//		System.out.println("List size: " + sut.getSize());
	}

	@Test
	void testAdd_AddItemAtSpecficIndex() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.add(5, 44);
		sut.add(6, 45);

		assertEquals(44, sut.get(5));
		assertEquals(45, sut.get(6));
		assertEquals(52, sut.getSize());

		System.out.println("List contents:");
		for (int i = 0; i < sut.getSize(); i++) {
			System.out.println("Index " + i + ": " + sut.get(i));
		}
		System.out.println("List size: " + sut.getSize());
	}

	@Test
	void testAdd_AddMultilpleItems() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.add(0, 100);
		sut.add(25, 200);
		sut.add(51, 300);

		assertEquals(100, sut.get(0));
		assertEquals(200, sut.get(25));
		assertEquals(300, sut.get(51));
		assertEquals(53, sut.getSize());
	}

	@Test
	void testAdd_WhenIndexIsNotExsist() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.add(100, 999);

		});
	}

	@Test
	void testRemove_DeleteOneItemInBeggining() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.remove(0);

		assertEquals(2, sut.get(0));
		assertEquals(49, sut.getSize());

	}

	@Test
	void testRemove_DeleteOneItemInEnd() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.remove(49);
		assertEquals(49, sut.get(48));
		assertEquals(49, sut.getSize());
	}

	@Test
	void testRemove_DeleteAspecficIndex() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.remove(36);
		assertEquals(38, sut.get(36));
		assertEquals(49, sut.getSize());

	}

	@Test
	void testRemove_DeleteMultilpleItems() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.remove(16);
		sut.remove(17);
		assertEquals(18, sut.get(16));
		assertEquals(20, sut.get(17));
		assertEquals(48, sut.getSize());
	}

	@Test
	void testRemove_DeleteWhenIndexNotExist() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.remove(100);

		});
	}

	@Test
	void testRemove_DeleteNotLeaveAnEmptySpace() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		generate50Numbers(sut);
		sut.remove(10);
		sut.remove(20);
		sut.remove(30);

		assertEquals(47, sut.getSize());
		assertEquals(12, sut.get(10));
		assertEquals(23, sut.get(20));
		assertEquals(34, sut.get(30));

		assertEquals(50, sut.get(sut.getSize() - 1));
	}

}