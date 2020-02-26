package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishActivity extends AppCompatActivity {

    private Toolbar actionbarEnglish;
    private Button saurischia,theropoda,Herrerasauria,Coelophysoidea,Ceratosauria,
            tetanuare,Ornithischia,dinazorresimleri,sauropodomorpha,Thecodontosaurus,
            riojasaurus,Sauropoda,Thyreophora,Cerapoda,Stegosauria,Ankylosauria,
            Pachycephalosauria,Ceratopsia,Ornithopoda,tiranozor,velociraptor,spinosaurus,
            brachiosaurus,diplodocus,Carnotaurus,brontozor,giganotosaurus,dilophosaurus,
            argentinosaurus,Bariyoniks,arkeopteriks,apatosaurus,troodon,nigersaurus,utahraptor,
            deinonychus,titanozor,gallimimus,deinocheirus,sauroposeidon,mamenchisaurus,
            plateosaurus,amargasaurus,eoraptor,ornithomimus,nyasasaurus,games;

    public void init(){
        actionbarEnglish=(Toolbar) findViewById(R.id.actionbarEnglish);
        setSupportActionBar(actionbarEnglish);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        games=(Button)findViewById(R.id.games);
        deinocheirus=(Button)findViewById(R.id.deinocheirus);
        sauroposeidon=(Button)findViewById(R.id.sauroposeidon);
        mamenchisaurus=(Button)findViewById(R.id.mamenchisaurus);
        plateosaurus=(Button)findViewById(R.id.plateosaurus);
        amargasaurus=(Button)findViewById(R.id.amargasaurus);
        eoraptor=(Button)findViewById(R.id.Eoraptor);
        ornithomimus=(Button)findViewById(R.id.Ornithomimus);
        nyasasaurus=(Button)findViewById(R.id.nyasasaurus);
        saurischia=(Button) findViewById(R.id.saurischia);
        theropoda=(Button) findViewById(R.id.theropoda);
        Herrerasauria=(Button)findViewById(R.id.Herrerasauria);
        Coelophysoidea=(Button) findViewById(R.id.Coelophysoidea);
        Ceratosauria=(Button) findViewById(R.id.Ceratosauria);
        tetanuare=(Button)findViewById(R.id.Tetanurae);
        sauropodomorpha=(Button)findViewById(R.id.sauropodomorpha);
        Thecodontosaurus=(Button)findViewById(R.id.Thecodontosaurus);
        riojasaurus=(Button)findViewById(R.id.riojasaurus);
        Sauropoda=(Button)findViewById(R.id.Sauropoda);
        Thyreophora=(Button)findViewById(R.id.Thyreophora);
        Cerapoda=(Button)findViewById(R.id.Cerapoda);
        Stegosauria=(Button)findViewById(R.id.Stegosauria);
        Ankylosauria=(Button)findViewById(R.id.Ankylosauria);
        Pachycephalosauria=(Button)findViewById(R.id.Pachycephalosauria);
        Ceratopsia=(Button)findViewById(R.id.Ceratopsia);
        Ornithopoda=(Button)findViewById(R.id.Ornithopoda);
        Ornithischia=(Button)findViewById(R.id.Ornithischia);
        dinazorresimleri=(Button)findViewById(R.id.dinazorresimleri);
        tiranozor=(Button)findViewById(R.id.tiranozor);
        velociraptor=(Button)findViewById(R.id.velociraptor);
        spinosaurus=(Button)findViewById(R.id.Spinosaurus);
        brachiosaurus=(Button)findViewById(R.id.Brachiosaurus);
        diplodocus=(Button)findViewById(R.id.diplodocus);
        Carnotaurus=(Button)findViewById(R.id.Carnotaurus);
        brontozor=(Button)findViewById(R.id.brontozor);
        giganotosaurus=(Button)findViewById(R.id.giganotosaurus);
        dilophosaurus=(Button)findViewById(R.id.dilophosaurus);
        argentinosaurus=(Button)findViewById(R.id.argentinosaurus);
        Bariyoniks=(Button)findViewById(R.id.Bariyoniks);
        arkeopteriks=(Button)findViewById(R.id.arkeopteriks);
        apatosaurus=(Button)findViewById(R.id.apatosaurus);
        troodon=(Button)findViewById(R.id.troodon);
        nigersaurus=(Button)findViewById(R.id.nigersaurus);
        utahraptor=(Button)findViewById(R.id.utahraptor);
        deinonychus=(Button)findViewById(R.id.deinonychus);
        titanozor=(Button)findViewById(R.id.titanozor);
        gallimimus=(Button)findViewById(R.id.gallimimus);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        init();

        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentgames=new Intent(EnglishActivity.this,GamesActivity.class);
                startActivity(intentgames);
            }
        });

        nyasasaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentny=new Intent(EnglishActivity.this,nyasasaurusActivity.class);
                startActivity(intentny);
            }
        });

        ornithomimus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenthomimu=new Intent(EnglishActivity.this,ornithomimusActivity.class);
                startActivity(intenthomimu);
            }
        });

        eoraptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenteo=new Intent(EnglishActivity.this,eoraptorActivity.class);
                startActivity(intenteo);
            }
        });

        amargasaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentamargasa=new Intent(EnglishActivity.this,amargasaurusActivity.class);
                startActivity(intentamargasa);
            }
        });

        plateosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentplato=new Intent(EnglishActivity.this,plateosaurusActivity.class);
                startActivity(intentplato);
            }
        });

        mamenchisaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmamen=new Intent(EnglishActivity.this,mamenchisaurusActivity.class);
                startActivity(intentmamen);
            }
        });

        sauroposeidon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsauro=new Intent(EnglishActivity.this,sauroposeidonActivity.class);
                startActivity(intentsauro);
            }
        });

        deinocheirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdeinoche=new Intent(EnglishActivity.this,deinocheirusActivity.class);
                startActivity(intentdeinoche);
            }
        });

        gallimimus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentgalli=new Intent(EnglishActivity.this,gallimimusActivity.class);
                startActivity(intentgalli);
            }
        });

        titanozor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttita=new Intent(EnglishActivity.this,titanozorActivity.class);
                startActivity(intenttita);
            }
        });

        deinonychus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdeino=new Intent(EnglishActivity.this,deinonychusActivity.class);
                startActivity(intentdeino);
            }
        });

        utahraptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentutah=new Intent(EnglishActivity.this,utahraptorActivity.class);
                startActivity(intentutah);
            }
        });

        nigersaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentnigo=new Intent(EnglishActivity.this,nigersaurusActivity.class);
                startActivity(intentnigo);
            }
        });

        troodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttro=new Intent(EnglishActivity.this,troodonActivity.class);
                startActivity(intenttro);
            }
        });

        apatosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentapato=new Intent(EnglishActivity.this,apatosaurusActivity.class);
                startActivity(intentapato);
            }
        });

        arkeopteriks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentarkeop=new Intent(EnglishActivity.this,arkeopteriksActivity.class);
                startActivity(intentarkeop);
            }
        });

        Bariyoniks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbari=new Intent(EnglishActivity.this,bariyoniksActivity.class);
                startActivity(intentbari);
            }
        });

        argentinosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentargenti=new Intent(EnglishActivity.this,argentinosaurusActivity.class);
                startActivity(intentargenti);
            }
        });

        dilophosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdilop=new Intent(EnglishActivity.this,dilophosaurusActivity.class);
                startActivity(intentdilop);
            }
        });

        giganotosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentgigano=new Intent(EnglishActivity.this,giganotosaurusActivity.class);
                startActivity(intentgigano);
            }
        });

        brontozor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbronto=new Intent(EnglishActivity.this,brontozorActivity.class);
                startActivity(intentbronto);
            }
        });

        Carnotaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcarno=new Intent(EnglishActivity.this,CarnotaurusActivity.class);
                startActivity(intentcarno);
            }
        });

        diplodocus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdiplo=new Intent(EnglishActivity.this,diplodocusActivity.class);
                startActivity(intentdiplo);
            }
        });

        brachiosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbrachio=new Intent(EnglishActivity.this,brachiosaurusActivity.class);
                startActivity(intentbrachio);
            }
        });

        spinosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentspino=new Intent(EnglishActivity.this,SpinosaurusActivity.class);
                startActivity(intentspino);
            }
        });

        velociraptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentvelo=new Intent(EnglishActivity.this,VelociraptorActivity.class);
                startActivity(intentvelo);
            }
        });

        tiranozor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttiranozor=new Intent(EnglishActivity.this,TiranozorActivity.class);
                startActivity(intenttiranozor);
            }
        });

        Pachycephalosauria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpachycep=new Intent(EnglishActivity.this,PachycephalosauriaActivity.class);
                startActivity(intentpachycep);
            }
        });

        dinazorresimleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentresim=new Intent(EnglishActivity.this,EnglishİmagesActivity.class);
                startActivity(intentresim);
            }
        });

        Ankylosauria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentanky=new Intent(EnglishActivity.this,AnkylosauriaActivity.class);
                startActivity(intentanky);
            }
        });

        Cerapoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcera=new Intent(EnglishActivity.this,CerapodaActivity.class);
                startActivity(intentcera);
            }
        });

        Thyreophora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthyre=new Intent(EnglishActivity.this,ThyreophoraActivity.class);
                startActivity(intentthyre);
            }
        });


        saurischia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsaurischia=new Intent(EnglishActivity.this,English2Activity.class);
                startActivity(intentsaurischia);
            }
        });

        theropoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttheropoda=new Intent(EnglishActivity.this,English3Activity.class);
                startActivity(intenttheropoda);

            }
        });
        Herrerasauria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentherrerasauria=new Intent(EnglishActivity.this,English4Activity.class);
                startActivity(intentherrerasauria);
            }
        });
        Coelophysoidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcoelophysoidea=new Intent(EnglishActivity.this,English5Activity.class);
                startActivity(intentcoelophysoidea);
            }
        });
        Ceratosauria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentceratosauria=new Intent(EnglishActivity.this,English6Activity.class);
                startActivity(intentceratosauria);
            }
        });

        tetanuare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttetanuare=new Intent(EnglishActivity.this,TetanuActivity.class);
                startActivity(intenttetanuare);
            }
        });
        Sauropoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsauropoda=new Intent(EnglishActivity.this,English11Activity.class);
                startActivity(intentsauropoda);
            }
        });
        Ornithopoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentornithopoda=new Intent(EnglishActivity.this,English19Activity.class);
                startActivity(intentornithopoda);
            }
        });
        Stegosauria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstegosauria=new Intent(EnglishActivity.this,English14Activity.class);
                startActivity(intentstegosauria);
            }
        });
        Ceratopsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentceratopsia=new Intent(EnglishActivity.this,English18Activity.class);
                startActivity(intentceratopsia);
            }
        });
        sauropodomorpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsauropodomorpha=new Intent(EnglishActivity.this,SauropodomorphaActivity.class);
                startActivity(intentsauropodomorpha);
            }
        });

        Thecodontosaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentteco=new Intent(EnglishActivity.this,ThecodontosaurusActivity.class);
                startActivity(intentteco);
            }
        });
        riojasaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentrio=new Intent(EnglishActivity.this,RiojasaurusActivity.class);
                startActivity(intentrio);
            }
        });

        Ornithischia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentornit=new Intent(EnglishActivity.this,OrnithischiaActivity.class);
                startActivity(intentornit);
            }
        });
    }
}
