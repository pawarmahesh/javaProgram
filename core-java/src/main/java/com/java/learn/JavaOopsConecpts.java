package com.java.learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class JavaOopsConecpts {
	Logger logger = LogManager.getLogger(JavaOopsConecpts.class);

	/*
	 * Java OOPS concepts 1. Class and objects 2. Encapsulation 3. Abstraction 4.
	 * Inheritance 5. Polymorphism
	 */

	// 3. Abstraction
	abstract class Shape {
		// abstract method to draw the shape
		abstract void draw();

		// concrete method to move the shape
		public void move(int x, int y) {
			logger.info("Moving .. Shape to position to ({} cm,{} cm).", x, y);
		}
	}

	interface Printable {
		void print();
	}

	// 1. Class 4. Inheritance
	class Circle extends Shape implements Printable {
		private int radius;

		Circle(int r) {
			this.radius = r;
		}

		// 2. Encapsulation
		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		@Override
		public void draw() {
			logger.info("Drawing .. Circle of radius {} cm.", getRadius());
		}

		public void draw(int r) {
			logger.info("Drawing .. Circle of radius {} cm.", r);
		}

		@Override
		public void print() {
			logger.info("Printing .. Circle of radius {} cm.", getRadius());

		}

	}

	// 1. Class 4. Inheritance
	class Rectangle extends Shape implements Printable {
		private int length;
		private int width;

		Rectangle(int l, int w) {
			this.length = l;
			this.width = w;
		}

		// 2. Encapsulation
		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		// 5. Polymorphism - method overriding - run time polymorphism
		@Override
		public void draw() {
			logger.info("Drawing .. Rectangle of length {} cm and width {} cm.", getLength(), getWidth());
		}

		@Override
		public void print() {
			logger.info("Printing .. Rectangle of length {} cm and width {} cm.", getLength(), getWidth());

		}
	}

	void execMethod() {

		Shape shape1 = new Circle(50);
		Shape shape2 = new Rectangle(250, 75);

		shape1.draw();
		shape1.move(15, 25);

		shape2.draw();
		shape2.move(35, 45);

		Circle circle1 = new Circle(30);

		// 5. Polymorphism - method overloading - compile time polymorphism
		circle1.draw();
		circle1.draw(15);
		circle1.print();
	}

}
