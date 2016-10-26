package com.java;

public class Goods2 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				TrackingSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
		}
	}

	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		g.track();
		System.out.println(getNmae());
	}

	private static String getNmae() {

		try {
			return "swift";
		} finally {
			System.out.println("finally");
		}
	}
}
