void reverseString(char* s, int sSize){
    int nFront = 0;
    int nTail = sSize - 1;
    char cMiddle = '0';

    while(nFront <= nTail)
    {
        cMiddle = s[nTail];
        s[nTail] = s[nFront];
        s[nFront] = cMiddle;

        nFront++;
        nTail--;
    }

}