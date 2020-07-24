package com.android.wordgame.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.wordgame.R;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Random;

public class gameActivity<i> extends AppCompatActivity {

    ImageView image00, image01, image02, image03, image04, image05, image10, image11, image12, image13, image14, image15, image20, image21, image22, image23, image24, image25, image30, image31, image32, image33, image34, image35, image40, image41, image42, image43, image44, image45;
    TextView text00, text01, text02, text03, text04, text05, text10, text11, text12, text13, text14, text15, text20, text21, text22, text23, text24, text25, text30, text31, text32, text33, text34, text35, text40, text41, text42, text43, text44, text45;
    TextView letter1, letter2, letter3, letter4, letter5,letter6;
    Button okay;
    Boolean controller;
    int i=1, j,sayi,control=0,control2=0,control3=0;;
    ArrayList <String> foundedWords=new ArrayList<String>();
    ArrayList <Integer> oldValuesOfNumber=new ArrayList<Integer>();
    ArrayList <Integer> oldValuesOfNumber2=new ArrayList<Integer>();
    ArrayList <Integer> oldValuesOfNumber3=new ArrayList<Integer>();
    float startTime, finishTime, totalTime = (float) 0.0,totalTime1 = (float) 0.0,totalTime3 = (float) 0.0;
    String level1Words[] = {"TAS", "SAT", "KAR", "ARK", "MİS", "SİM", "ZAN", "NAZ", "İLK", "KİL", "KAS", "SAK"};  //1.Seviyenin kelimeleri tanimlanmistir
    String level2Words[] = {"MARS", "ARS", "SAM", "KAYA", "YAKA", "AYAK", "MAYA", "YAMA", "AYA", "SIRA", "SARI", "ASIR", "SIR", "SAAT", "ATA", "TASA", "ASA", "RANA", "ANA", "NAR"}; //2.Seviyenin kelimeleri tanimlanmistir
    String level3Words[] = {"SALAM", "MASAL", "AMA", "SAL", "ASAL", "KİTAP", "PATİK", "İKTA", "KAT", "ESANS", "SEN", "ANS", "ESAS", "SEANS", "KATIR", "ARTIK", "ATIK", "KIT", "KEFİR", "REFİK", "EFİR", "ERK", "KALEM", "EMLAK", "AMEL", "KEL"}; //3.Seviyenin kelimeleri tanimlanmistir
    public String valueL1,valueL2,valueL3,valueL4,valueL5,valueL6;
    String name;
    ArrayList<String> click=new ArrayList<String>();
    int hesapla=0;

    public TextView gameWord;

    public ImageView[] imagesArray;
    public TextView[] textsArray;
    public TextView[] lettersArray;
    public int chance=0,levelCounter=1,score=0,score1=0,score3=0; //Kacinci levelde oldugumuzu tutan degisken bolumler gecildikce sayisi artacak

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(float finishTime) {
        this.finishTime = finishTime;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(float totalTime) {
        this.totalTime = totalTime;
    }

    public float getTotalTime1() {
        return totalTime1;
    }

    public void setTotalTime1(float totalTime1) {
        this.totalTime1 = totalTime1;
    }

    public float getTotalTime3() {
        return totalTime3;
    }

    public void setTotalTime3(float totalTime3) {
        this.totalTime3 = totalTime3;
    }

    public int getLevelCounter() {
        return levelCounter;
    }

    public void setLevelCounter(int levelCounter) {
        this.levelCounter = levelCounter;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public String getValueL1() {
        return valueL1;
    }

    public void setValueL1(String valueL1) {
        this.valueL1 = valueL1;
    }

    public String getValueL2() {
        return valueL2;
    }

    public void setValueL2(String valueL2) {
        this.valueL2 = valueL2;
    }

    public String getValueL3() {
        return valueL3;
    }

    public void setValueL3(String valueL3) {
        this.valueL3 = valueL3;
    }

    public String getValueL4() {
        return valueL4;
    }

    public void setValueL4(String valueL4) {
        this.valueL4 = valueL4;
    }

    public String getValueL5() {
        return valueL5;
    }

    public void setValueL5(String valueL5) {
        this.valueL5 = valueL5;
    }

    public String getValueL6() {
        return valueL6;
    }

    public void setValueL6(String valueL6) {
        this.valueL6 = valueL6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }



    public void clickLetter1(View w){
        setValueL1(letter1.getText().toString());
        click.add(getValueL1());
        for(int i=0;i<click.size();i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);
        }
    }
    public void clickLetter2(View w){
        setValueL2(letter2.getText().toString());
        click.add(getValueL2());
        for(int i=0;i<click.size()+1;i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);
        }
    }
    public void clickLetter3(View w){
        setValueL3(letter3.getText().toString());
        click.add(getValueL3());
        for(int i=0;i<click.size()+1;i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);
        }
    }
    public void clickLetter4(View w){
        setValueL4(letter4.getText().toString());
        click.add(getValueL4());
        for(int i=0;i<click.size();i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);

        }
    }
    public void clickLetter5(View w){
        setValueL5(letter5.getText().toString());
        click.add(getValueL5());
        for(int i=0;i<click.size();i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);

        }
    }
    public void clickLetter6(View w){
        setValueL6(letter6.getText().toString());
        click.add(getValueL6());
        for(int i=0;i<click.size();i++) {
            gameWord.setText(gameWord.getText()+click.get(i));
            click.remove(i);
        }
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public void saveLevel1(){
        Intent intent=new Intent(gameActivity.this,scoreActivity.class);
        intent.putExtra("score",String.valueOf(getScore1()));
        intent.putExtra("name",getName());
        intent.putExtra("totalTime",String.valueOf(getTotalTime1()));
        startActivity(intent);
    }

    public void saveLevel2(){
        Intent intent=new Intent(gameActivity.this,scoreActivity.class);

        intent.putExtra("score",String.valueOf(getScore1()));
        intent.putExtra("name",getName());
        intent.putExtra("totalTime",String.valueOf(getTotalTime1()));

        intent.putExtra("score2",String.valueOf(getScore3()));
        intent.putExtra("name2",getName());
        intent.putExtra("totalTime2",String.valueOf(getTotalTime3()));
        startActivity(intent);
    }


    public void openNextLevel(){
        int bak;
        control=0;
        control2=0;
        control3=0;
        hesapla=getScore()+scoreCounter(getChance());
        setScore(hesapla);
        setChance(0);
        bak=getLevelCounter()+1;
        setLevelCounter(bak);

        if(bak==7){  // Yeni levele gecince score'u sifirla
            setScore1(getScore()); //Level1'in score'u
            setTotalTime1(getTotalTime());
            saveLevel1();
            setFinishTime(System.nanoTime());
            setStartTime(System.nanoTime()); //Baslama zamanini set ettik
            setScore(0);
        }
        else if(bak==13){
            setScore3(getScore());
            setTotalTime3(getTotalTime());
            saveLevel2();
            setFinishTime(System.nanoTime());
            setStartTime(System.nanoTime()); //Baslama zamanini set ettik
            setScore(0);
        }

        invisibleViews();
        call();
    }

    public void nextLevelControl(boolean controller){
        if(controller==true){
            openNextLevel();
        }
    }

    public static int produceRandomNumber(){
        return ((int) (Math.random()*6) + 1);
    }

    public boolean thatsOkay(ArrayList<Integer> oldValuesOfNumber){

        int number = produceRandomNumber();

        if(oldValuesOfNumber.size() == 0){ //first move.
            oldValuesOfNumber.add(number);
            setSayi(number);
            return  true;
        }else{ //other steps
            if(oldValuesOfNumber.contains(number)){
                return thatsOkay(oldValuesOfNumber);
            }else{
                oldValuesOfNumber.add(number);
                setSayi(number);
                return true;
            }
        }
    }

    public void clickOkayButton(View w) {
        int btnCounter;
        btnCounter=getChance()+1;
        setChance(btnCounter);

        String hadi=gameWord.getText().toString();
        if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==1){
            controller=level1Game1(hadi);
            nextLevelControl(controller);

        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==2){
            controller=level1Game2(hadi);
            nextLevelControl(controller);
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==3){
            controller=level1Game3(hadi);
            nextLevelControl(controller);
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==4){
            controller=level1Game4(hadi);
            nextLevelControl(controller);
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==5){
            controller=level1Game5(hadi);
            nextLevelControl(controller);
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==6){
            controller=level1Game6(hadi);
            nextLevelControl(controller);
        }
        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==1){
            controller=level2Game1(hadi);
            nextLevelControl(controller);
        }
        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==2){
            controller=level2Game2(hadi);
            nextLevelControl(controller);
        }

        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==3){
            controller=level2Game3(hadi);
            nextLevelControl(controller);
        }
        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==4){
            controller=level2Game4(hadi);
            nextLevelControl(controller);
        }
        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==5){
            controller=level2Game5(hadi);
            nextLevelControl(controller);
        }
        else if(7<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==6){
            controller=level2Game6(hadi);
            nextLevelControl(controller);
        }

        else if(13<=levelCounter && levelCounter<=18 && sayi==1) {
            controller=level3Game1(hadi);
            nextLevelControl(controller);
        }
        else if(13<=levelCounter && levelCounter<=18 && sayi==2){
            controller=level3Game2(hadi);
            nextLevelControl(controller);
        }
        else if(13<=levelCounter && levelCounter<=18 && sayi==3){
            controller=level3Game3(hadi);
            nextLevelControl(controller);
        }
        else if(13<=levelCounter && levelCounter<=18 && sayi==4){
            controller=level3Game4(hadi);
            nextLevelControl(controller);
        }
        else if(13<=levelCounter && levelCounter<=18 && sayi==5){
            controller=level3Game5(hadi);
            nextLevelControl(controller);
        }
        else if(13<=levelCounter && levelCounter<=18 && sayi==6){
            controller=level3Game6(hadi);
            nextLevelControl(controller);
        }
        gameWord.setText("");
    }

    public void onCreateSettings(){
        if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==1){
            setLetterOfLevel1Game1();
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==2){
            setLetterOfLevel1Game2();
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==3){
            setLetterOfLevel1Game3();
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==4){
            setLetterOfLevel1Game4();
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==5){
            setLetterOfLevel1Game5();
        }
        else if(1<=getLevelCounter() && getLevelCounter()<=6 && getSayi()==6){
            setLetterOfLevel1Game6();
        }
        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==1){
            setLetterOfLevel2Game1();
        }
        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==2){
            setLetterOfLevel2Game2();
        }

        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==3){
            setLetterOfLevel2Game3();
        }
        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==4){
            setLetterOfLevel2Game4();
        }
        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==5){
            setLetterOfLevel2Game5();
        }
        else if(6<=getLevelCounter() && getLevelCounter()<=12 && getSayi()==6){
            setLetterOfLevel2Game6();
        }

        else if(12<=levelCounter && levelCounter<=18 && sayi==1) {
            setLetterOfLevel3Game1();
        }
        else if(12<=levelCounter && levelCounter<=18 && sayi==2){
            setLetterOfLevel3Game2();
        }
        else if(12<=levelCounter && levelCounter<=18 && sayi==3){
            setLetterOfLevel3Game3();
        }
        else if(12<=levelCounter && levelCounter<=18 && sayi==4){
            setLetterOfLevel3Game4();
        }
        else if(12<=levelCounter && levelCounter<=18 && sayi==5){
            setLetterOfLevel3Game5();
        }
        else if(12<=levelCounter && levelCounter<=18 && sayi==6){
            setLetterOfLevel3Game6();
        }

    }

    public void clickPauseIcon(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(gameActivity.this);
        builder.setTitle("\u23F8️ Paused");
        builder.setMessage("Do you want to continue from your level?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(gameActivity.this, "Click last game button for continue", Toast.LENGTH_LONG).show();

                if(1<=getLevelCounter() && getLevelCounter()<=6)
                 saveLevel1();
                else if(7<=getLevelCounter() && getLevelCounter()<=12)
                    saveLevel2();
                // oyunu kaydetme metodu gelecek

            }
        });

        builder.setNegativeButton("No, Leave me alone", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(gameActivity.this, "We will miss you", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), startActivity.class);
                startActivity(intent);
            }
        });
        AlertDialog dialog = builder.create(); //Alert diyologu olusturma metodu
        dialog.show(); //Alert dialogu ekrana basar

    }

    public void call(){
        if(getLevelCounter()<19) {

            if(1<=getLevelCounter() && getLevelCounter()<=6 && thatsOkay(oldValuesOfNumber)==true)
                onCreateSettings();
            else if(7<=getLevelCounter() && getLevelCounter()<=12 && thatsOkay(oldValuesOfNumber2)==true)
                onCreateSettings();
            else if(13<=getLevelCounter() && getLevelCounter()<=18 && thatsOkay(oldValuesOfNumber3)==true)
                onCreateSettings();
        }
        else { //Oyun bitmistir
            setFinishTime(System.nanoTime());
            setTotalTime((getFinishTime() - getStartTime()) / 1000000000);

            Intent intent=new Intent(gameActivity.this,scoreActivity.class);
            String score=String.valueOf(getScore());
            String totalTime=String.valueOf(getTotalTime());

            intent.putExtra("score",String.valueOf(getScore1()));
            intent.putExtra("name",getName());
            intent.putExtra("totalTime",String.valueOf(getTotalTime1()));

            intent.putExtra("score2",String.valueOf(getScore3()));
            intent.putExtra("name2",getName());
            intent.putExtra("totalTime2",String.valueOf(getTotalTime3()));

            intent.putExtra("score3",score);
            intent.putExtra("name3",getName());
            intent.putExtra("totalTime3",totalTime);

            startActivity(intent);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putAll(savedInstanceState);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamescreen); //gamescreen xml ini sayfaya yukler
        setStartTime(System.nanoTime()); //Baslama zamanini set ettik

        ImageView pauseIcon = findViewById(R.id.pauseicon);
        ImageView mixIcon = findViewById(R.id.mixicon);
        okay=findViewById(R.id.okay);
        gameWord=findViewById(R.id.gameWord);
        textsArray = textInitialize(textsArray);
        imagesArray = imageInitialize(imagesArray);
        lettersArray = letterInitialize(lettersArray);
        invisibleViews(); //Ekran acilir acilmaz imageViewlar ve textViewlar gorunmez olacak
        Intent start=getIntent();
        setName(start.getStringExtra("name"));

            call(); //Tum olay bu fonksiyonla ilgili

    }

    public TextView[] letterInitialize(TextView[] lettersArray) {
        letter1 = findViewById(R.id.letter1);
        letter2 = findViewById(R.id.letter2);
        letter3 = findViewById(R.id.letter3);
        letter4 = findViewById(R.id.letter4);
        letter5 = findViewById(R.id.letter5);
        letter6 = findViewById(R.id.letter6);
        lettersArray = new TextView[]{letter1, letter2, letter3, letter4, letter5,letter6};
        return lettersArray;
    }

    public TextView[] textInitialize(TextView[] textsArray) {
        text00 = findViewById(R.id.text00);
        text01 = findViewById(R.id.text01);
        text02 = findViewById(R.id.text02);
        text03 = findViewById(R.id.text03);
        text04 = findViewById(R.id.text04);
        text05 = findViewById(R.id.text05);
        text10 = findViewById(R.id.text10);
        text11 = findViewById(R.id.text11);
        text12 = findViewById(R.id.text12);
        text13 = findViewById(R.id.text13);
        text14 = findViewById(R.id.text14);
        text15 = findViewById(R.id.text15);
        text20 = findViewById(R.id.text20);
        text21 = findViewById(R.id.text21);
        text22 = findViewById(R.id.text22);
        text23 = findViewById(R.id.text23);
        text24 = findViewById(R.id.text24);
        text25 = findViewById(R.id.text25);
        text30 = findViewById(R.id.text30);
        text31 = findViewById(R.id.text31);
        text32 = findViewById(R.id.text32);
        text33 = findViewById(R.id.text33);
        text34 = findViewById(R.id.text34);
        text35 = findViewById(R.id.text35);
        text40 = findViewById(R.id.text40);
        text41 = findViewById(R.id.text41);
        text42 = findViewById(R.id.text42);
        text43 = findViewById(R.id.text43);
        text44 = findViewById(R.id.text44);
        text45 = findViewById(R.id.text45);
        textsArray = new TextView[]{text00, text01, text02, text03, text04, text05, text10, text11, text12, text13, text14, text15, text20, text21, text22, text23, text24, text25, text30, text31, text32, text33, text34, text35,
                text40, text41, text42, text43, text44, text45};
        return textsArray;
    }

    public ImageView[] imageInitialize(ImageView[] imagesArray) {
        //for(ImageView image: imagesArray)
        image00 = findViewById(R.id.image00);
        image01 = findViewById(R.id.image01);
        image02 = findViewById(R.id.image02);
        image03 = findViewById(R.id.image03);
        image04 = findViewById(R.id.image04);
        image05 = findViewById(R.id.image05);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image20 = findViewById(R.id.image20);
        image21 = findViewById(R.id.image21);
        image22 = findViewById(R.id.image22);
        image23 = findViewById(R.id.image23);
        image24 = findViewById(R.id.image24);
        image25 = findViewById(R.id.image25);
        image30 = findViewById(R.id.image30);
        image31 = findViewById(R.id.image31);
        image32 = findViewById(R.id.image32);
        image33 = findViewById(R.id.image33);
        image34 = findViewById(R.id.image34);
        image35 = findViewById(R.id.image35);
        image40 = findViewById(R.id.image40);
        image41 = findViewById(R.id.image41);
        image42 = findViewById(R.id.image42);
        image43 = findViewById(R.id.image43);
        image44 = findViewById(R.id.image44);
        image45 = findViewById(R.id.image45);

        imagesArray = new ImageView[]{image00, image01, image02, image03, image04, image05, image10, image11, image12, image13, image14, image15, image20, image21, image22, image23, image24, image25,
                image30, image31, image32, image33, image34, image35, image40, image41, image42, image43, image44, image45};
        return imagesArray;
    }


    /*Kac kere deneme yaptigi bilgisinin gonderilmesi gerekiyor*/
    public int scoreCounter(int chance) {
        int puan;
        setFinishTime(System.nanoTime());
        System.out.println("Bitis: "+getFinishTime());
        setTotalTime((getFinishTime() - getStartTime()) / 1000000000);
        System.out.println("Total Time: "+getTotalTime());
        puan=(int) (100000 / (getTotalTime() * chance));
        return puan;
    }

    public void letterMixer(View w) {
        String firstLetter0, firstLetter1, firstLetter2, firstLetter3, firstLetter4, firstLetter5;
        firstLetter0 = lettersArray[0].getText().toString();
        firstLetter1 = lettersArray[1].getText().toString();
        firstLetter2 = lettersArray[2].getText().toString();
        firstLetter3 = lettersArray[3].getText().toString();
        firstLetter4 = lettersArray[4].getText().toString();
        firstLetter5 = lettersArray[5].getText().toString();
        sayi = (int) (Math.random() * 3);

        if (1 <= getLevelCounter() && getLevelCounter() <= 6)  // Seviye 1dedir
        {
            if (sayi == 1) {
                lettersArray[0].setText(firstLetter3);
                letter1.setText(firstLetter3);
                lettersArray[4].setText(firstLetter0);
                letter5.setText(firstLetter0);
                lettersArray[3].setText(firstLetter4);
                letter4.setText(firstLetter4);
            } else if (sayi == 2) {
                lettersArray[0].setText(firstLetter4);
                letter1.setText(firstLetter4);
                lettersArray[4].setText(firstLetter3);
                letter5.setText(firstLetter3);
                lettersArray[3].setText(firstLetter0);
                letter4.setText(firstLetter0);
            } else {
                lettersArray[0].setText(firstLetter3);
                letter1.setText(firstLetter3);
                lettersArray[4].setText(firstLetter4);
                letter5.setText(firstLetter4);
                lettersArray[3].setText(firstLetter0);
                letter4.setText(firstLetter0);
            }
        } else if (7 <= getLevelCounter() && getLevelCounter() <= 12) {
            if (sayi == 1) {
                lettersArray[0].setText(firstLetter4);
                lettersArray[4].setText(firstLetter5);
                lettersArray[3].setText(firstLetter0);
                lettersArray[5].setText(firstLetter3);
            } else if (sayi == 2) {
                lettersArray[0].setText(firstLetter5);
                lettersArray[4].setText(firstLetter3);
                lettersArray[3].setText(firstLetter4);
                lettersArray[5].setText(firstLetter0);
            } else {
                lettersArray[0].setText(firstLetter3);
                lettersArray[4].setText(firstLetter0);
                lettersArray[3].setText(firstLetter5);
                lettersArray[5].setText(firstLetter4);
            }

        } else {
            if (sayi == 1) {
                lettersArray[0].setText(firstLetter2);
                lettersArray[4].setText(firstLetter1);
                lettersArray[3].setText(firstLetter0);
                lettersArray[1].setText(firstLetter4);
                lettersArray[2].setText(firstLetter3);


            } else if (sayi == 2) {
                lettersArray[0].setText(firstLetter3);
                lettersArray[4].setText(firstLetter2);
                lettersArray[3].setText(firstLetter1);
                lettersArray[1].setText(firstLetter4);
                lettersArray[2].setText(firstLetter0);
            } else {
                lettersArray[0].setText(firstLetter4);
                lettersArray[4].setText(firstLetter1);
                lettersArray[3].setText(firstLetter0);
                lettersArray[1].setText(firstLetter2);
                lettersArray[2].setText(firstLetter3);
            }
        }
    }

    public void invisibleViews() {
        for (ImageView image : imagesArray)
            image.setVisibility(View.INVISIBLE); //tum imagelari gorunmez yapacak
        for (TextView text : textsArray)
            text.setVisibility(View.INVISIBLE); //tum textleri gorunmez yapacak
        for (TextView text : lettersArray)
            text.setVisibility(View.INVISIBLE); //tum harfleri gorunmez yapacak
    }

    //  Harf Alanindaki Harfleri Seviyelere Gore Aktive Eder
    public  void activeLevel1Letters(TextView[] lettersArray) {
        lettersArray[0].setVisibility(View.VISIBLE);
        lettersArray[3].setVisibility(View.VISIBLE);
        lettersArray[4].setVisibility(View.VISIBLE);
    }
    public  void activeLevel2Letters(TextView[] lettersArray) {
        lettersArray[0].setVisibility(View.VISIBLE);
        lettersArray[5].setVisibility(View.VISIBLE);
        lettersArray[3].setVisibility(View.VISIBLE);
        lettersArray[4].setVisibility(View.VISIBLE);
    }
    public  void activeLevel3Letters(TextView[] lettersArray) {
        for (TextView text : lettersArray)
            text.setVisibility(View.VISIBLE); //tum harfleri gorunur yapar
        lettersArray[5].setVisibility(View.INVISIBLE);
    }

    public void generalSettings(String[] look, String[] let){
        for (int i=0;i<29;i++) {
            for(j=0;j<look.length;j++)
                if(look[j].equalsIgnoreCase(String.valueOf(i))){
                    imagesArray[i].setVisibility(View.VISIBLE);
                    textsArray[i].setText(let[j]);
                }
        }
    }

    public void setLetterOfLevel1Game1() {
        String[] look={"7","8","9","15","21"};
        String[] let={"T","A","S","A","T"};
        activeLevel1Letters(lettersArray);        // A,S,T
        lettersArray[0].setText("A");
        lettersArray[4].setText("S");
        lettersArray[3].setText("T");
        generalSettings(look,let);
    }


    public boolean level1Game1(String hadi) {
        if(hadi.equalsIgnoreCase("tas")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }

        if(hadi.equalsIgnoreCase("sat")) {
            for (int i = 9; i <= 21; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    public void setLetterOfLevel1Game2(){
        activeLevel1Letters(lettersArray);    //  R,K,A
        lettersArray[0].setText("R");
        lettersArray[4].setText("K");
        lettersArray[3].setText("A");
        String[] look={"7","8","9","14","20"};
        String[] let={"K","A","R","R","K"};
        generalSettings(look,let);
    }


    public boolean level1Game2(String hadi) {

        if(hadi.equalsIgnoreCase("kar")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(hadi.equalsIgnoreCase("ark")) {
            for (int i = 8; i <= 20; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    public void setLetterOfLevel1Game3() {
        activeLevel1Letters(lettersArray);
        lettersArray[0].setText("M");
        lettersArray[4].setText("S");
        lettersArray[3].setText("İ");

        String[] look={"7","8","9","15","21"};
        String[] let={"M"," İ","S"," İ","M"};      // M,S,İ
        generalSettings(look,let);

    }

    public boolean level1Game3(String hadi) {
        if(hadi.equalsIgnoreCase("mis")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(hadi.equalsIgnoreCase("sim")) {
            for (int i = 9; i <= 21; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    public void setLetterOfLevel1Game4(){
        activeLevel1Letters(lettersArray);     // N,Z,A
        lettersArray[0].setText("N");
        lettersArray[4].setText("Z");
        lettersArray[3].setText("A");
        String[] look={"7","8","9","15","21"};
        String[] let={"Z","A","N","A","Z"};
        generalSettings(look,let);
    }


    public boolean level1Game4(String hadi) {
        if(hadi.equalsIgnoreCase("zan")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(hadi.equalsIgnoreCase("naz")) {
            for (int i = 9; i <= 21; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    public void setLetterOfLevel1Game5(){
        activeLevel1Letters(lettersArray);
        lettersArray[0].setText("İ");      //  İ,K,L
        lettersArray[4].setText("K");
        lettersArray[3].setText("L");

        String[] look={"7","8","9","14","20"};
        String[] let={"K"," İ","L"," İ","K"};      // M,S,İ
        generalSettings(look,let);
    }

    public boolean level1Game5(String hadi) {
        if(hadi.equalsIgnoreCase("kil")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(hadi.equalsIgnoreCase("ilk")) {
            for (int i = 8; i <= 20; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    public void setLetterOfLevel1Game6(){
        activeLevel1Letters(lettersArray);  // S,K,A,
        lettersArray[0].setText("S");
        lettersArray[4].setText("K");
        lettersArray[3].setText("A");
        String[] look={"7","8","9","15","21"};
        String[] let={"K","A","S","A","K"};
        generalSettings(look,let);
    }

    public boolean level1Game6(String hadi) {
        if(hadi.equalsIgnoreCase("kas")) {
            for (int i = 7; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(hadi.equalsIgnoreCase("sak")) {
            for (int i = 9; i <= 21; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control++;
        }
        if(control==2)
            return true;
        return false;
    }

    /////level2 metodlari gelecek

    public void setLetterOfLevel2Game1(){
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("A");
        lettersArray[5].setText("M");
        lettersArray[3].setText("S");
        lettersArray[4].setText("R");

        String[] look={"7","8","9","10","14","16","20","22"};
        String[] let={"M","A","R","S","R","A","S","M"};
        generalSettings(look,let);
    }

    public boolean level2Game1(String hadi){

        if(hadi.equalsIgnoreCase("mars")) {
            for (int i = 7; i <= 10; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("ars")) {
            for (int i = 8; i <= 20; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("sam")) {
            for (int i = 10; i <= 22; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==3)
            return true;
        return false;
    }

    public void setLetterOfLevel2Game2(){
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("Y");
        lettersArray[5].setText("A");
        lettersArray[3].setText("A");
        lettersArray[4].setText("K");
        String[] look={"6","7","8","9","15","21","25","26","27","28"};
        String[] let={"K","A","Y","A","Y","A","Y","A","K","A"};
        generalSettings(look,let);
    }

    public boolean level2Game2(String hadi){

        if(hadi.equalsIgnoreCase("kaya")) {
            for (int i = 6; i <= 9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("ayak")) {
            for (int i = 9; i <= 27; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("yaka")) {
            for (int i = 25; i <= 28; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==3)
            return true;
        return false;
    }

    public void setLetterOfLevel2Game3(){
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("Y");
        lettersArray[5].setText("M");
        lettersArray[3].setText("A");
        lettersArray[4].setText("A");
        String[] look={"2","7","8","9","10","14","16","20","22"};
        String[] let={"Y","M","A","Y","A","M","Y","A","A"};
        generalSettings(look,let);
    }

    public boolean level2Game3(String hadi){

        if(hadi.equalsIgnoreCase("yama")) {
            for (int i = 2; i <= 20; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("maya")) {
            for (int i = 7; i <= 10; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.toString().equalsIgnoreCase("aya")) {
            for (int i = 10; i <= 22; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==3)
            return true;
        return false;
    }

    public void setLetterOfLevel2Game4(){
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("I");
        lettersArray[5].setText("S");
        lettersArray[3].setText("R");
        lettersArray[4].setText("A");

        String[] look={"7","8","9","10","13","16","19","22","24","25","26","28"};
        String[] let={"S"," I","R","A","A","S","R"," I","S"," I","R","R"};
        generalSettings(look,let);
    }

    public boolean level2Game4(String hadi){

        if(hadi.equalsIgnoreCase("sıra")) {
            for (int i = 7; i <= 10; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("asır")) {
            for (int i = 10; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("sarı")) {
            for (int i = 7; i <= 25; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("sır")) {
            for (int i = 24; i <= 26; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==4)
            return true;
        return false;
    }

    public void setLetterOfLevel2Game5(){
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("T");
        lettersArray[5].setText("S");
        lettersArray[3].setText("A");
        lettersArray[4].setText("A");
        imagesArray[29].setVisibility(View.VISIBLE);
        textsArray[29].setVisibility(View.VISIBLE);

        String[] look={"6","7","8","9","13","15","19","21","27","28","29"};
        String[] let={"S","A","A","T","T","A","A","S","A","S","A"};
        generalSettings(look,let);
    }
    public boolean level2Game5(String hadi){

        if(hadi.equalsIgnoreCase("saat")) {
            for (int i = 6; i <=9; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("tasa")) {
            for (int i = 9; i <= 27; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("ata")) {
            for (int i = 7; i <= 19; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("asa")) {
            textsArray[29].setText("A");
            for (int i = 27; i <= 29; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==4)
            return true;
        return false;
    }

    public void setLetterOfLevel2Game6() {
        activeLevel2Letters(lettersArray);
        lettersArray[0].setText("A");
        lettersArray[5].setText("A");
        lettersArray[3].setText("N");
        lettersArray[4].setText("R");

        String[] look={"10","13","14","15","16","20","22","26"};
        String[] let={"N","R","A","N","A","N","R","A"};
        generalSettings(look,let);
    }

    public boolean level2Game6(String hadi){

        if(hadi.equalsIgnoreCase("rana")) {
            for (int i = 13; i <= 16; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("ana")) {
            for (int i = 14; i <= 26; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(hadi.equalsIgnoreCase("nar")) {
            for (int i = 10; i <= 22; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control2++;
        }
        if(control2==3)
            return true;
        return false;
    }

    ////level3 bulmacalari

    public void setLetterOfLevel3Game1() {
        lettersArray[0].setText("S");   // S  A  L  A  M  5
        lettersArray[1].setText("M");   // .  M  .  .  A  11
        lettersArray[2].setText("A");   // S  A  L  .  S  17
        lettersArray[3].setText("L");   // .  .  .  .  A  23
        lettersArray[4].setText("A");   // .  A  S  A  L  29

        activeLevel3Letters(lettersArray);
        String[] look={"0","1","2","3","4","7","10","12","13","14","16","22","25","26","27","28"};
        String[] let={"S","A","L","A","M","M","A","S","A","L","S","A","A","S","A","L"};
        generalSettings(look,let);

    }
    public boolean level3Game1(String hadi) {

        if(hadi.equalsIgnoreCase("salam")) {
            for (int i = 0; i <= 4; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("masal")) {
            for (int i = 4; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("asal")) {
            for (int i = 25; i <= 28; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("ama")) {
            for (int i = 1; i <= 13; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("sal")) {
            for (int i = 12; i <= 14; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==5)
            return true;
        return false;
    }

    public void setLetterOfLevel3Game2() {
        lettersArray[0].setText("P");   // K  İ  T  A  P  5
        lettersArray[1].setText("İ");   // .  K  .  .  A  11
        lettersArray[2].setText("K");   // .  T  .  .  T  17
        lettersArray[3].setText("A");   // K  A  T  .  İ  23
        lettersArray[4].setText("T");   // .  .  .  .  K  29
        activeLevel3Letters(lettersArray);
        String[] look={"0","1","2","3","4","7","10","13","16","18","19","20","22","28"};
        String[] let={"K"," İ","T","A","P","K","A","T","T","K","A","T"," İ","K"};
        generalSettings(look,let);
    }

    public boolean level3Game2(String hadi) {

        if(hadi.equalsIgnoreCase("kitap")) {
            for (int i = 0; i <= 4; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("patik")) {
            for (int i = 4; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("ikta")) {
            for (int i = 1; i <= 19; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("kat")) {
            for (int i = 18; i <= 20; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==4)
            return true;
        return false;
    }

    public void setLetterOfLevel3Game3() {
        lettersArray[0].setText("E");   // E  S  A  N  S  5
        lettersArray[1].setText("N");   // .  E  .  .  E  11
        lettersArray[2].setText("S");   // A  N  S  .  A  17
        lettersArray[3].setText("A");   // .  .  .  .  N  23
        lettersArray[4].setText("S");   // .  E  S  A  S  29
        activeLevel3Letters(lettersArray);
        String[] look={"0","1","2","3","4","7","10","12","13","14","16","22","25","26","27","28"};
        String[] let={"E","S","A","N","S","E","E","A","N","S","A","N","E","S","A","S",};
        generalSettings(look,let);
    }
    public boolean level3Game3(String hadi) {

        if(hadi.equalsIgnoreCase("esans")) {
            for (int i=0;i<=4;i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("seans")) {
            for (int i=4;i<=28;i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("esas")) {
            for (int i=25;i<=28;i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("sen")) {
            for (int i=1;i<=13;i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("ans")) {
            for (int i=12;i<=14;i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==5)
            return true;
        return false;
    }

    public void setLetterOfLevel3Game4() {
        lettersArray[0].setText("R");       // .  .  .  .  A  5
        lettersArray[1].setText("I");       // K  A  T  I  R  11
        lettersArray[2].setText("T");       // .  T  .  .  T  17
        lettersArray[3].setText("K");       // K  I  T  .  I  23
        lettersArray[4].setText("A");       // .  K  .  .  K  29

        activeLevel3Letters(lettersArray);
        String[] look={"4","6","7","8","9","10","13","16","18","19","20","22","25","28"};
        String[] let={"A","K","A","T"," I", "R","T","T","K"," I","T"," I","K","K",};
        generalSettings(look,let);
    }

    public boolean level3Game4(String hadi) {

        if(hadi.equalsIgnoreCase("katır")) {
            for (int i = 6; i <= 10; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("artık")) {
            for (int i = 4; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("atık")) {
            for (int i = 7; i <= 25; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("kıt")) {
            for (int i = 18; i <= 20; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==4)
            return true;
        return false;
    }

    public void setLetterOfLevel3Game5() {
        lettersArray[0].setText("R");   // K  E  F  İ  R  5
        lettersArray[1].setText("F");   // .  F  .  .  E  11
        lettersArray[2].setText("İ");   // .  İ  .  .  F  17
        lettersArray[3].setText("E");   // E  R  K  .  İ  23
        lettersArray[4].setText("K");   // .  .  .  .  K  29
        activeLevel3Letters(lettersArray);
        String[] look={"0","1","2","3","4","7","10","13","16","18","19","20","22","28"};
        String[] let={"K","E","F"," İ","R","F","E"," İ","F","E","R","K"," İ","K",};
        generalSettings(look,let);
    }
    public boolean level3Game5(String hadi) {

        if(hadi.equalsIgnoreCase("kefir")) {
            for (int i = 0; i <= 4; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("refik")) {
            for (int i = 4; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("efir")) {
            for (int i = 1; i <= 19; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("erk")) {
            for (int i = 18; i <= 20; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==4)
            return true;
        return false;
    }

    public void setLetterOfLevel3Game6(){
        lettersArray[0].setText("E");        // .  .  .  .  E  5
        lettersArray[1].setText("K");        // K  A  L  E  M  11
        lettersArray[2].setText("A");        // .  M  .  .  L  17
        lettersArray[3].setText("M");        // K  E  L  .  A  23
        lettersArray[4].setText("L");        // .  L  .  .  K  29
        activeLevel3Letters(lettersArray);
        String[] look={"4","6","7","8","9","10","13","16","18","19","20","22","25","28"};
        String[] let={"E","K","A","L","E","M","M","L","K","E","L","A","L","K"};
        generalSettings(look,let);
    }
    public boolean level3Game6(String hadi) {

        if(hadi.equalsIgnoreCase("kalem")) {
            for (int i = 6; i <= 10; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("emlak")) {
            for (int i = 4; i <= 28; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("amel")) {
            for (int i = 7; i <= 25; i=i+6)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(hadi.equalsIgnoreCase("kel")) {
            for (int i = 18; i <= 20; i++)
                textsArray[i].setVisibility(View.VISIBLE);
            control3++;
        }
        if(control3==4)
            return true;
        return false;
    }

}