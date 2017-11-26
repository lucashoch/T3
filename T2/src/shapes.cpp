#include "shapes.h"

void Triangle::render() {
	glColor4f(c.r, c.g, c.b, 0.15f);
	glBegin(GL_TRIANGLES);
		glVertex2f(x - size, y - size);
		glVertex2f(x + size, y - size);
		glVertex2f(x, y + size);
	glEnd();
	//std::cout << "Rendering Triangles: " << x << " " << y << " " << size << std::endl;
}

void Triangle::update() {

}

void Square::render() {
	glColor4f(c.r, c.g, c.b, 0.15f);
	glBegin(GL_QUADS);
		glVertex2f(-x-size, -y-size);
		glVertex2f(x+size , -y-size);
		glVertex2f(x+size, y+size);
		glVertex2f(-x-size, y+size);
	glEnd();
	//std::cout << "X: " << x << "Y: " << y <<std::endl;
}

void Square::update() {

}

void setColor(ColorCode c, Color &color) {
	switch(c) {
		case BLUE:
			color.r = 0.0f;
			color.g = 0.0f;
			color.b = 0.75f;
			color.a = 0.30f;
			break;
		case RED:
			color.r = 0.75f;
			color.g = 0.0f;
			color.b = 0.0f;
			color.a = 0.30f;
			break;
		case GREEN:
			color.r = 0.0f;
			color.g = 0.75f;
			color.b = 0.0f;
			color.a = 0.30f;
			break;
		case PURPLE:
			color.r = 0.75f;
			color.g = 0.10f;
			color.b = 0.75f;
			color.a = 0.30f;
			break;
	}
}
