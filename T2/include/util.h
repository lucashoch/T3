#ifndef UTIL_H
#define UTIL_H

#include <iostream>

#include "opengl.h"
#include "shapes.h"
#include "globals.h"

extern int SCREEN_WIDTH;
extern int SCREEN_HEIGHT;
extern int SCREEN_FPS;

bool initGL();
void update();
void render();
void handleInput(unsigned char key, int x, int y);

#endif
