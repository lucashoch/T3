#include "opengl.h"
#include "util.h"
#include "globals.h"
#include "shapes.h"

void runMainLoop(int val);

int main(int argc, char** argv) {
	glutInit(&argc, argv);

	if(!initGL()) {
		std::cout << "Unable to init lib." << std::endl;
		return 1;
	}

	// Keyboard handler
	glutKeyboardFunc(handleInput);

	// Set rendering function
	glutDisplayFunc(render);

	// Set main loop
	glutTimerFunc(1000 / SCREEN_FPS, runMainLoop, 0);

	running = true;

	// Start GLUT main loop
	glutMainLoop();

	return 0;
}

void runMainLoop(int val) {
	// Frame logic
	update();
	render();

	// Run frame one more time
	/*if(running)*/	glutTimerFunc(1000 / SCREEN_FPS, runMainLoop, val);
	//else return;
}
