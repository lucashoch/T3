#include "util.h"

int SCREEN_WIDTH = 600;
int SCREEN_HEIGHT = 400;
int SCREEN_FPS = 60;

bool initGL() {
	// Create OpenGL 2.1 context
	glutInitContextVersion(2, 1);

	// Create Double Buffered Window
	glutInitDisplayMode(GLUT_DOUBLE);
	glutInitWindowSize(SCREEN_WIDTH, SCREEN_HEIGHT);
	glutCreateWindow("VLANG");

	// Set the viewport
	glViewport(0.f, 0.f, SCREEN_WIDTH, SCREEN_HEIGHT);

	// Init projection matrix
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(0.0, SCREEN_WIDTH, SCREEN_HEIGHT, 0.0, 1.0, -1.0);

	// Init Modelview Matrix
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	// Enable transparency
	glEnable(GL_BLEND);
	glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

	// Initialize clear color -> Black
	glClearColor(1.f, 1.0f, 1.0f, 1.f);

	// Check error
	GLenum error = glGetError();
	if(error != GL_NO_ERROR){ 
		std::cout << "Error initializing OpenGL! - " << gluErrorString(error)  << std::endl;
		return false;
	}

	return true;
}

void createTriangle(GLfloat x, GLfloat y, int size, ColorCode c) {
	formStack.push_back(new Triangle(x, y, size, c));	
}

void createSquare(GLfloat x, GLfloat y, int size, ColorCode c) {
	formStack.push_back(new Square(x, y, size, c));	
}

void update() {}

void render() {
	// Clear color buffer
	glClear(GL_COLOR_BUFFER_BIT);

	// Reset modelview matrix
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	// Move to center of the screen
	glTranslatef(SCREEN_WIDTH/2.f, SCREEN_HEIGHT/2.f, 0.f);

	// Viewport
	glViewport(0.f, 0.f, SCREEN_WIDTH, SCREEN_HEIGHT);

	//glBegin(GL_QUADS);
		//glColor3f(1.f, 0.5f, 0.f);
		//glVertex2f(-50.f, 50.f);
		//glVertex2f(-50.f, -50.f);
		//glVertex2f(50.f, -50.f);
		//glVertex2f(50.f, 50.f);
	//glEnd();

	if(formStack.size() > 0) {
		for(int i = 0 ; i < formStack.size() ; i++) {
			//std::cout << "Form render: " << i << std::endl;
			formStack[i]->render();
		}
	}

	glutSwapBuffers();
}

void handleInput(unsigned char key, int x, int y) {
	if(key == 'q') {
		//running = false;
		std::cout << "Pressed Q" << std::endl;
		formStack.push_back(new Square((rand() % 500) - 250, (rand() % 500) - 250, 50.f, RED));
		//formStack.push_back(new Square(0, 0, 50.f, RED));
	} else if(key == 'e') {
		//running = false;
		std::cout << "Pressed E" << std::endl;
	} else if(key == 't') {
		//running = false;
		formStack.push_back(new Triangle((rand() % 500) - 250, (rand() % 500) - 250, 50.f, BLUE));
		//formStack.push_back(new Triangle(0, 0, 50.f, BLUE));
		std::cout << "Pressed T" << std::endl;
	}
}
