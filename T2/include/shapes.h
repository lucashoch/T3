#ifndef SHAPES_H
#define SHAPES_H

#include "opengl.h"
#include <iostream>

struct Color {
	GLfloat r;
	GLfloat g;
	GLfloat b;
	GLfloat a;
};

typedef enum ColorCode {
	BLUE = 1,
	RED = 2,
	GREEN = 3,
	PURPLE = 4
} ColorCode;

void setColor(ColorCode c, Color& color);

class Form {
public:
	Form(GLfloat x_, GLfloat y_, GLfloat size_, ColorCode c_ ) {
		x = x_;
		y = y_;
		size = size_;
		setColor(c_, c);
	}
	~Form();

	virtual  void render() = 0;
	virtual  void update() = 0;
protected:
	GLfloat x, y;
	Color c;
	int size;
};

class Triangle : public Form {
public:
	Triangle(GLfloat x_, GLfloat y_, int size_, ColorCode c_) : Form(x_, y_, size_, c_) {}	
	~Triangle(){}

	 void render();
	 void update();
};

class Square : public Form {
public:
	Square(GLfloat x_, GLfloat y_, int size_, ColorCode c_) : Form(x_, y_, size_, c_){}
	~Square(){}

	void render();
	void update();
};

#endif
