#include<iostream>
#include<string>
#include<vector>
#include<unordered_set>
using namespace std;

class brokenletters{
    public:
    int canBeTypedWords(string text, string brokenLetters){
        bool mp[26];

        for( char &ch : brokenLetters){
            mp[ch-'a']= true;
        }
        int result = 0;
        bool canType = true;

        for(char &ch : text){ //i=0; i< text.length; i++
            if(ch == ' '){
                if(canType){
                    result++;
                }
                canType = true;
            } else if(mp[ch - 'a'] == true){ //broken characters
                canType = false;
            }
        }
        if (canType) {
            result++;
        }
        return result;
    }
};
int main() {
    brokenletters keyboard; // Create an instance of the class
    string text1 = "hello world";
    string broken1 = "ad";
    
    int count1 = keyboard.canBeTypedWords(text1, broken1);
    cout << "Number of typable words: " << count1 << endl; // Output: 1

    string text2 = "leet code";
    string broken2 = "lt";
    
    int count2 = keyboard.canBeTypedWords(text2, broken2);
    cout << "Number of typable words: " << count2 << endl; // Output: 0

    return 0;
}