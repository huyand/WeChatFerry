﻿// dllmain.cpp : 定义 DLL 应用程序的入口点。
#include "framework.h"
#include <iostream>
#include <sstream>

#include "spy.h"
BOOL APIENTRY DllMain(HMODULE hModule, DWORD ul_reason_for_call, LPVOID lpReserved)
{
    switch (ul_reason_for_call) {
        case DLL_PROCESS_ATTACH:
            //PortPath_t p;
            //p.port = 1234;
            ////p.path = "";
            //InitSpy(&p);
        case DLL_THREAD_ATTACH:
        case DLL_THREAD_DETACH:
        case DLL_PROCESS_DETACH:
            break;
    }
    return TRUE;
}
