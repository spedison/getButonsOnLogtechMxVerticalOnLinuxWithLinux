package br.com.spedison.events;

public interface Event {

    // Structure:: Event -> Type -> Code -> Value.

    final static public int type_EV_REL = 2;
    final static public int code_REL_X = 0;
    final static public int code_REL_Y = 1;
    final static public int code_REL_HWHEEL = 6;
    final static public int code_REL_WHEEL = 8;
    final static public int code_REL_WHEEL_HI_RES = 11;
    final static public int code_REL_HWHEEL_HI_RES = 12;


    static final int TYPE_EV_MSC = 4;
    static final int TYPE_EV_MSC_SCAN = 4;

    static final int EV_KEY = 1;
    static final int EV_REL = 2; // Type
    static final int EV_REL_X = 0;
    static final int REL_WHEEL = 8; // CODE
    static final int REL_WHEEL_HI_RES = 11;
    static final int REL_WHEEL_HI_RES_VALUE_UP = 120;
    static final int REL_WHEEL_HI_RES_VALUE_DOWN = -120;


    static final int EV_BTN_SIDE = 275;
    static final int EV_BTN_EXTRA = 276;
    //static final int EV_BTN_EXTRA = 276;


}

/*
Supported events:
  Event type 0 (EV_SYN)
  Event type 1 (EV_KEY)
    Event code 1 (KEY_ESC)
    Event code 2 (KEY_1)
    Event code 3 (KEY_2)
    Event code 4 (KEY_3)
    Event code 5 (KEY_4)
    Event code 6 (KEY_5)
    Event code 7 (KEY_6)
    Event code 8 (KEY_7)
    Event code 9 (KEY_8)
    Event code 10 (KEY_9)
    Event code 11 (KEY_0)
    Event code 12 (KEY_MINUS)
    Event code 13 (KEY_EQUAL)
    Event code 14 (KEY_BACKSPACE)
    Event code 15 (KEY_TAB)
    Event code 16 (KEY_Q)
    Event code 17 (KEY_W)
    Event code 18 (KEY_E)
    Event code 19 (KEY_R)
    Event code 20 (KEY_T)
    Event code 21 (KEY_Y)
    Event code 22 (KEY_U)
    Event code 23 (KEY_I)
    Event code 24 (KEY_O)
    Event code 25 (KEY_P)
    Event code 26 (KEY_LEFTBRACE)
    Event code 27 (KEY_RIGHTBRACE)
    Event code 28 (KEY_ENTER)
    Event code 29 (KEY_LEFTCTRL)
    Event code 30 (KEY_A)
    Event code 31 (KEY_S)
    Event code 32 (KEY_D)
    Event code 33 (KEY_F)
    Event code 34 (KEY_G)
    Event code 35 (KEY_H)
    Event code 36 (KEY_J)
    Event code 37 (KEY_K)
    Event code 38 (KEY_L)
    Event code 39 (KEY_SEMICOLON)
    Event code 40 (KEY_APOSTROPHE)
    Event code 41 (KEY_GRAVE)
    Event code 42 (KEY_LEFTSHIFT)
    Event code 43 (KEY_BACKSLASH)
    Event code 44 (KEY_Z)
    Event code 45 (KEY_X)
    Event code 46 (KEY_C)
    Event code 47 (KEY_V)
    Event code 48 (KEY_B)
    Event code 49 (KEY_N)
    Event code 50 (KEY_M)
    Event code 51 (KEY_COMMA)
    Event code 52 (KEY_DOT)
    Event code 53 (KEY_SLASH)
    Event code 54 (KEY_RIGHTSHIFT)
    Event code 55 (KEY_KPASTERISK)
    Event code 56 (KEY_LEFTALT)
    Event code 57 (KEY_SPACE)
    Event code 58 (KEY_CAPSLOCK)
    Event code 59 (KEY_F1)
    Event code 60 (KEY_F2)
    Event code 61 (KEY_F3)
    Event code 62 (KEY_F4)
    Event code 63 (KEY_F5)
    Event code 64 (KEY_F6)
    Event code 65 (KEY_F7)
    Event code 66 (KEY_F8)
    Event code 67 (KEY_F9)
    Event code 68 (KEY_F10)
    Event code 69 (KEY_NUMLOCK)
    Event code 70 (KEY_SCROLLLOCK)
    Event code 71 (KEY_KP7)
    Event code 72 (KEY_KP8)
    Event code 73 (KEY_KP9)
    Event code 74 (KEY_KPMINUS)
    Event code 75 (KEY_KP4)
    Event code 76 (KEY_KP5)
    Event code 77 (KEY_KP6)
    Event code 78 (KEY_KPPLUS)
    Event code 79 (KEY_KP1)
    Event code 80 (KEY_KP2)
    Event code 81 (KEY_KP3)
    Event code 82 (KEY_KP0)
    Event code 83 (KEY_KPDOT)
    Event code 85 (KEY_ZENKAKUHANKAKU)
    Event code 86 (KEY_102ND)
    Event code 87 (KEY_F11)
    Event code 88 (KEY_F12)
    Event code 89 (KEY_RO)
    Event code 90 (KEY_KATAKANA)
    Event code 91 (KEY_HIRAGANA)
    Event code 92 (KEY_HENKAN)
    Event code 93 (KEY_KATAKANAHIRAGANA)
    Event code 94 (KEY_MUHENKAN)
    Event code 95 (KEY_KPJPCOMMA)
    Event code 96 (KEY_KPENTER)
    Event code 97 (KEY_RIGHTCTRL)
    Event code 98 (KEY_KPSLASH)
    Event code 99 (KEY_SYSRQ)
    Event code 100 (KEY_RIGHTALT)
    Event code 102 (KEY_HOME)
    Event code 103 (KEY_UP)
    Event code 104 (KEY_PAGEUP)
    Event code 105 (KEY_LEFT)
    Event code 106 (KEY_RIGHT)
    Event code 107 (KEY_END)
    Event code 108 (KEY_DOWN)
    Event code 109 (KEY_PAGEDOWN)
    Event code 110 (KEY_INSERT)
    Event code 111 (KEY_DELETE)
    Event code 113 (KEY_MUTE)
    Event code 114 (KEY_VOLUMEDOWN)
    Event code 115 (KEY_VOLUMEUP)
    Event code 116 (KEY_POWER)
    Event code 117 (KEY_KPEQUAL)
    Event code 119 (KEY_PAUSE)
    Event code 120 (KEY_SCALE)
    Event code 121 (KEY_KPCOMMA)
    Event code 122 (KEY_HANGUEL)
    Event code 123 (KEY_HANJA)
    Event code 124 (KEY_YEN)
    Event code 125 (KEY_LEFTMETA)
    Event code 126 (KEY_RIGHTMETA)
    Event code 127 (KEY_COMPOSE)
    Event code 128 (KEY_STOP)
    Event code 129 (KEY_AGAIN)
    Event code 130 (KEY_PROPS)
    Event code 131 (KEY_UNDO)
    Event code 132 (KEY_FRONT)
    Event code 133 (KEY_COPY)
    Event code 134 (KEY_OPEN)
    Event code 135 (KEY_PASTE)
    Event code 136 (KEY_FIND)
    Event code 137 (KEY_CUT)
    Event code 138 (KEY_HELP)
    Event code 139 (KEY_MENU)
    Event code 140 (KEY_CALC)
    Event code 142 (KEY_SLEEP)
    Event code 144 (KEY_FILE)
    Event code 150 (KEY_WWW)
    Event code 152 (KEY_SCREENLOCK)
    Event code 155 (KEY_MAIL)
    Event code 156 (KEY_BOOKMARKS)
    Event code 158 (KEY_BACK)
    Event code 159 (KEY_FORWARD)
    Event code 161 (KEY_EJECTCD)
    Event code 163 (KEY_NEXTSONG)
    Event code 164 (KEY_PLAYPAUSE)
    Event code 165 (KEY_PREVIOUSSONG)
    Event code 166 (KEY_STOPCD)
    Event code 167 (KEY_RECORD)
    Event code 168 (KEY_REWIND)
    Event code 169 (KEY_PHONE)
    Event code 171 (KEY_CONFIG)
    Event code 172 (KEY_HOMEPAGE)
    Event code 173 (KEY_REFRESH)
    Event code 174 (KEY_EXIT)
    Event code 176 (KEY_EDIT)
    Event code 177 (KEY_SCROLLUP)
    Event code 178 (KEY_SCROLLDOWN)
    Event code 179 (KEY_KPLEFTPAREN)
    Event code 180 (KEY_KPRIGHTPAREN)
    Event code 181 (KEY_NEW)
    Event code 182 (KEY_REDO)
    Event code 183 (KEY_F13)
    Event code 184 (KEY_F14)
    Event code 185 (KEY_F15)
    Event code 186 (KEY_F16)
    Event code 187 (KEY_F17)
    Event code 188 (KEY_F18)
    Event code 189 (KEY_F19)
    Event code 190 (KEY_F20)
    Event code 191 (KEY_F21)
    Event code 192 (KEY_F22)
    Event code 193 (KEY_F23)
    Event code 194 (KEY_F24)
    Event code 204 (KEY_DASHBOARD)
    Event code 206 (KEY_CLOSE)
    Event code 207 (KEY_PLAY)
    Event code 208 (KEY_FASTFORWARD)
    Event code 209 (KEY_BASSBOOST)
    Event code 210 (KEY_PRINT)
    Event code 212 (KEY_CAMERA)
    Event code 216 (KEY_CHAT)
    Event code 217 (KEY_SEARCH)
    Event code 219 (KEY_FINANCE)
    Event code 223 (KEY_CANCEL)
    Event code 224 (KEY_BRIGHTNESSDOWN)
    Event code 225 (KEY_BRIGHTNESSUP)
    Event code 228 (KEY_KBDILLUMTOGGLE)
    Event code 229 (KEY_KBDILLUMDOWN)
    Event code 230 (KEY_KBDILLUMUP)
    Event code 231 (KEY_SEND)
    Event code 232 (KEY_REPLY)
    Event code 233 (KEY_FORWARDMAIL)
    Event code 234 (KEY_SAVE)
    Event code 235 (KEY_DOCUMENTS)
    Event code 240 (KEY_UNKNOWN)
    Event code 241 (KEY_VIDEO_NEXT)
    Event code 244 (KEY_BRIGHTNESS_ZERO)
    Event code 256 (BTN_0)
    Event code 272 (BTN_LEFT)
    Event code 273 (BTN_RIGHT)
    Event code 274 (BTN_MIDDLE)
    Event code 275 (BTN_SIDE)
    Event code 276 (BTN_EXTRA)
    Event code 277 (BTN_FORWARD)
    Event code 278 (BTN_BACK)
    Event code 279 (BTN_TASK)
    Event code 280 (?)
    Event code 281 (?)
    Event code 282 (?)
    Event code 283 (?)
    Event code 284 (?)
    Event code 285 (?)
    Event code 286 (?)
    Event code 287 (?)
    Event code 353 (KEY_SELECT)
    Event code 354 (KEY_GOTO)
    Event code 358 (KEY_INFO)
    Event code 362 (KEY_PROGRAM)
    Event code 366 (KEY_PVR)
    Event code 370 (KEY_SUBTITLE)
    Event code 372 (KEY_ZOOM)
    Event code 374 (KEY_KEYBOARD)
    Event code 375 (KEY_SCREEN)
    Event code 376 (KEY_PC)
    Event code 377 (KEY_TV)
    Event code 378 (KEY_TV2)
    Event code 379 (KEY_VCR)
    Event code 380 (KEY_VCR2)
    Event code 381 (KEY_SAT)
    Event code 383 (KEY_CD)
    Event code 384 (KEY_TAPE)
    Event code 386 (KEY_TUNER)
    Event code 387 (KEY_PLAYER)
    Event code 389 (KEY_DVD)
    Event code 392 (KEY_AUDIO)
    Event code 393 (KEY_VIDEO)
    Event code 396 (KEY_MEMO)
    Event code 397 (KEY_CALENDAR)
    Event code 398 (KEY_RED)
    Event code 399 (KEY_GREEN)
    Event code 400 (KEY_YELLOW)
    Event code 401 (KEY_BLUE)
    Event code 402 (KEY_CHANNELUP)
    Event code 403 (KEY_CHANNELDOWN)
    Event code 405 (KEY_LAST)
    Event code 407 (KEY_NEXT)
    Event code 408 (KEY_RESTART)
    Event code 409 (KEY_SLOW)
    Event code 410 (KEY_SHUFFLE)
    Event code 412 (KEY_PREVIOUS)
    Event code 416 (KEY_VIDEOPHONE)
    Event code 417 (KEY_GAMES)
    Event code 418 (KEY_ZOOMIN)
    Event code 419 (KEY_ZOOMOUT)
    Event code 420 (KEY_ZOOMRESET)
    Event code 421 (KEY_WORDPROCESSOR)
    Event code 422 (KEY_EDITOR)
    Event code 423 (KEY_SPREADSHEET)
    Event code 424 (KEY_GRAPHICSEDITOR)
    Event code 425 (KEY_PRESENTATION)
    Event code 426 (KEY_DATABASE)
    Event code 427 (KEY_NEWS)
    Event code 428 (KEY_VOICEMAIL)
    Event code 429 (KEY_ADDRESSBOOK)
    Event code 430 (KEY_MESSENGER)
    Event code 431 (KEY_DISPLAYTOGGLE)
    Event code 432 (KEY_SPELLCHECK)
    Event code 433 (KEY_LOGOFF)
    Event code 439 (KEY_MEDIA_REPEAT)
    Event code 442 (KEY_IMAGES)
    Event code 576 (KEY_BUTTONCONFIG)
    Event code 577 (KEY_TASKMANAGER)
    Event code 578 (KEY_JOURNAL)
    Event code 579 (KEY_CONTROLPANEL)
    Event code 580 (KEY_APPSELECT)
    Event code 581 (KEY_SCREENSAVER)
    Event code 582 (KEY_VOICECOMMAND)
    Event code 583 (KEY_ASSISTANT)
    Event code 584 (?)
    Event code 585 (?)
    Event code 586 (?)
    Event code 587 (?)
    Event code 588 (?)
    Event code 589 (?)
    Event code 592 (KEY_BRIGHTNESS_MIN)
    Event code 593 (KEY_BRIGHTNESS_MAX)
    Event code 608 (KEY_KBDINPUTASSIST_PREV)
    Event code 609 (KEY_KBDINPUTASSIST_NEXT)
    Event code 610 (KEY_KBDINPUTASSIST_PREVGROUP)
    Event code 611 (KEY_KBDINPUTASSIST_NEXTGROUP)
    Event code 612 (KEY_KBDINPUTASSIST_ACCEPT)
    Event code 613 (KEY_KBDINPUTASSIST_CANCEL)
  Event type 3 (EV_ABS)
    Event code 32 (ABS_VOLUME)
      Value      0
      Min        1
      Max      767
  Event type 4 (EV_MSC)
    Event code 4 (MSC_SCAN)
  Event type 17 (EV_LED)
    Event code 0 (LED_NUML) state 0
    Event code 1 (LED_CAPSL) state 0
    Event code 2 (LED_SCROLLL) state 0
    Event code 3 (LED_COMPOSE) state 0
    Event code 4 (LED_KANA) state 0
Key repeat handling:
  Repeat type 20 (EV_REP)
    Repeat code 0 (REP_DELAY)
      Value    250
    Repeat code 1 (REP_PERIOD)
      Value     33

* */