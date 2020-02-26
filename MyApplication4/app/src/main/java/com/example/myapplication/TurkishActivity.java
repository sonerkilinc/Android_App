package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkishActivity extends AppCompatActivity {

    private Toolbar actionbarTurkish;
    private Button saurischia1,theropoda1,Herrerasauria1,Coelophysoidea1,Ceratosauria1,tetanuare1,Ornithischia1,dinazorresimleri1,
            sauropodomorpha1,Thecodontosaurus1,riojasaurus1,Sauropoda1,Thyreophora1,Cerapoda1,Stegosauria1,Ankylosauria1,Pachycephalosauria1,Ceratopsia1,Ornithopoda1,
            tiranozor1,velociraptor1,spinosaurus1,brachiosaurus1,diplodocus1,Carnotaurus1,brontozor1,giganotosaurus1,dilophosaurus1,argentinosaurus1,
            Bariyoniks1,arkeopteriks1,apatosaurus1,troodon1,nigersaurus1,utahraptor1,deinonychus1,titanozor1,gallimimus1,
            deinocheirus1,sauroposeidon1,mamenchisaurus1,plateosaurus1,amargasaurus1,eoraptor1,ornithomimus1,nyasasaurus1;

    public void init(){

        actionbarTurkish=(Toolbar) findViewById(R.id.actionbarTurkish);
        setSupportActionBar(actionbarTurkish);
        getSupportActionBar().setTitle("Kategoriler");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        deinocheirus1=(Button)findViewById(R.id.deinocheirus1);
        sauroposeidon1=(Button)findViewById(R.id.sauroposeidon1);
        mamenchisaurus1=(Button)findViewById(R.id.mamenchisaurus1);
        plateosaurus1=(Button)findViewById(R.id.plateosaurus1);
        amargasaurus1=(Button)findViewById(R.id.amargasaurus1);
        eoraptor1=(Button)findViewById(R.id.Eoraptor1);
        ornithomimus1=(Button)findViewById(R.id.Ornithomimus1);
        nyasasaurus1=(Button)findViewById(R.id.nyasasaurus1);
        saurischia1=(Button) findViewById(R.id.saurischia1);
        theropoda1=(Button) findViewById(R.id.theropoda1);
        Herrerasauria1=(Button)findViewById(R.id.Herrerasauria1);
        Coelophysoidea1=(Button) findViewById(R.id.Coelophysoidea1);
        Ceratosauria1=(Button) findViewById(R.id.Ceratosauria1);
        tetanuare1=(Button)findViewById(R.id.Tetanurae1);
        sauropodomorpha1=(Button)findViewById(R.id.sauropodomorpha1);
        Thecodontosaurus1=(Button)findViewById(R.id.Thecodontosaurus1);
        riojasaurus1=(Button)findViewById(R.id.riojasaurus1);
        Sauropoda1=(Button)findViewById(R.id.Sauropoda1);
        Thyreophora1=(Button)findViewById(R.id.Thyreophora1);
        Cerapoda1=(Button)findViewById(R.id.Cerapoda1);
        Stegosauria1=(Button)findViewById(R.id.Stegosauria1);
        Ankylosauria1=(Button)findViewById(R.id.Ankylosauria1);
        Pachycephalosauria1=(Button)findViewById(R.id.Pachycephalosauria1);
        Ceratopsia1=(Button)findViewById(R.id.Ceratopsia1);
        Ornithopoda1=(Button)findViewById(R.id.Ornithopoda1);
        Ornithischia1=(Button)findViewById(R.id.Ornithischia1);
        dinazorresimleri1=(Button)findViewById(R.id.dinazorresimleri1);
        tiranozor1=(Button)findViewById(R.id.tiranozor1);
        velociraptor1=(Button)findViewById(R.id.velociraptor1);
        spinosaurus1=(Button)findViewById(R.id.Spinosaurus1);
        brachiosaurus1=(Button)findViewById(R.id.Brachiosaurus1);
        diplodocus1=(Button)findViewById(R.id.diplodocus1);
        Carnotaurus1=(Button)findViewById(R.id.Carnotaurus1);
        brontozor1=(Button)findViewById(R.id.brontozor1);
        giganotosaurus1=(Button)findViewById(R.id.giganotosaurus1);
        dilophosaurus1=(Button)findViewById(R.id.dilophosaurus1);
        argentinosaurus1=(Button)findViewById(R.id.argentinosaurus1);
        Bariyoniks1=(Button)findViewById(R.id.Bariyoniks1);
        arkeopteriks1=(Button)findViewById(R.id.arkeopteriks1);
        apatosaurus1=(Button)findViewById(R.id.apatosaurus1);
        troodon1=(Button)findViewById(R.id.troodon1);
        nigersaurus1=(Button)findViewById(R.id.nigersaurus1);
        utahraptor1=(Button)findViewById(R.id.utahraptor1);
        deinonychus1=(Button)findViewById(R.id.deinonychus1);
        titanozor1=(Button)findViewById(R.id.titanozor1);
        gallimimus1=(Button)findViewById(R.id.gallimimus1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish);
        init();

        saurischia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsauris=new Intent(TurkishActivity.this,Turkish2Activity.class);
                startActivity(intentsauris);
            }
        });
        theropoda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthero=new Intent(TurkishActivity.this,Turkish3Activity.class);
                startActivity(intentthero);
            }
        });

        Herrerasauria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentherrera=new Intent(TurkishActivity.this,Turkish4Activity.class);
                startActivity(intentherrera);
            }
        });

        Coelophysoidea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcoelop=new Intent(TurkishActivity.this,Turkish5Activity.class);
                startActivity(intentcoelop);
            }
        });

        Ceratosauria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcerato=new Intent(TurkishActivity.this,Turkish6Activity.class);
                startActivity(intentcerato);
            }
        });

        tetanuare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentteta=new Intent(TurkishActivity.this,TurkTetanuActivity.class);
                startActivity(intentteta);
            }
        });

        sauropodomorpha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsauropodomo=new Intent(TurkishActivity.this,TurkSauropodomorphaActivity.class);
                startActivity(intentsauropodomo);
            }
        });

        Thecodontosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturktheco=new Intent(TurkishActivity.this,TurkThecodontosaurusActivity.class);
                startActivity(intentturktheco);
            }
        });

        riojasaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkrio=new Intent(TurkishActivity.this,TurkriojasaurusActivity.class);
                startActivity(intentturkrio);
            }
        });

        Sauropoda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturksauropoda=new Intent(TurkishActivity.this,turksauropodaActivity.class);
                startActivity(intentturksauropoda);
            }
        });

        Ornithischia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkornit=new Intent(TurkishActivity.this,TurkornithischiaActivity.class);
                startActivity(intentturkornit);
            }
        });

        Thyreophora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkthyre=new Intent(TurkishActivity.this,TurkthyreophoraActivity.class);
                startActivity(intentturkthyre);
            }
        });

        Stegosauria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentstego1=new Intent(TurkishActivity.this,TurkstegosauriaActivity.class);
                startActivity(intentstego1);
            }
        });


        Ankylosauria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkanky=new Intent(TurkishActivity.this,TurkAnkyloActivity.class);
                startActivity(intentturkanky);
            }
        });

        Cerapoda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkcerapoda=new Intent(TurkishActivity.this,turkcerapodaActivity.class);
                startActivity(intentturkcerapoda);
            }
        });

        Pachycephalosauria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkpachy=new Intent(TurkishActivity.this,TurkpachyActivity.class);
                startActivity(intentturkpachy);
            }
        });

        Ceratopsia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkceratop=new Intent(TurkishActivity.this,TurkceratopsiaActivity.class);
                startActivity(intentturkceratop);
            }
        });

        Ornithopoda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkornithopoda=new Intent(TurkishActivity.this,TurkOrnithopodaActivity.class);
                startActivity(intentturkornithopoda);
            }
        });

        tiranozor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturktira=new Intent(TurkishActivity.this,TurktiranozorActivity.class);
                startActivity(intentturktira);
            }
        });

        velociraptor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkvelo=new Intent(TurkishActivity.this,TurkVelocirapActivity.class);
                startActivity(intentturkvelo);
            }
        });

        spinosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkspino=new Intent(TurkishActivity.this,turkspinosaurusActivity.class);
                startActivity(intentturkspino);
            }
        });

        brachiosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkbrachi=new Intent(TurkishActivity.this,turkbrachiosaurusActivity.class);
                startActivity(intentturkbrachi);
            }
        });

        diplodocus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkdiplo=new Intent(TurkishActivity.this,turkdiplodocusActivity.class);
                startActivity(intentturkdiplo);
            }
        });

        Carnotaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkcarno=new Intent(TurkishActivity.this,TurkcarnotaurusActivity.class);
                startActivity(intentturkcarno);
            }
        });

        brontozor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkbro=new Intent(TurkishActivity.this,TurkbrontozorActivity.class);
                startActivity(intentturkbro);
            }
        });

        giganotosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentturkgiga=new Intent(TurkishActivity.this,turkgiganotoActivity.class);
                startActivity(intentturkgiga);
            }
        });

        dilophosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkdilophosaurus=new Intent(TurkishActivity.this,turkdilophosaurusActivity.class);
                startActivity(intentturkdilophosaurus);
            }
        });

        argentinosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkargen=new Intent(TurkishActivity.this,TurkargentinoActivity.class);
                startActivity(intentturkargen);
            }
        });

        Bariyoniks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkbariyo=new Intent(TurkishActivity.this,turkbariyoniksActivity.class);
                startActivity(intentturkbariyo);
            }
        });

        arkeopteriks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkarkeop=new Intent(TurkishActivity.this,TurkarkeopteriksActivity.class);
                startActivity(intentturkarkeop);
            }
        });
        apatosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkapato=new Intent(TurkishActivity.this,TurkapatosaurusActivity.class);
                startActivity(intentturkapato);
            }
        });
        troodon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturktro=new Intent(TurkishActivity.this,turktroodonActivity.class);
                startActivity(intentturktro);
            }
        });

        nigersaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturknige=new Intent(TurkishActivity.this,turknigersaurusActivity.class);
                startActivity(intentturknige);
            }
        });

        utahraptor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkutah=new Intent(TurkishActivity.this,TurkutahrapActivity.class);
                startActivity(intentturkutah);
            }
        });

        deinonychus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkdeinonychus=new Intent(TurkishActivity.this,turkdeinonychusActivity.class);
                startActivity(intentturkdeinonychus);
            }
        });

        titanozor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturktita=new Intent(TurkishActivity.this,TurktitanozorActivity.class);
                startActivity(intentturktita);
            }
        });

        gallimimus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkgalli=new Intent(TurkishActivity.this,turkgalliActivity.class);
                startActivity(intentturkgalli);
            }
        });

        deinocheirus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkdeinocheir=new Intent(TurkishActivity.this,TurkdeinocheirusActivity.class);
                startActivity(intentturkdeinocheir);
            }
        });
        sauroposeidon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturksauroposei=new Intent(TurkishActivity.this,turksauroposeidonActivity.class);
                startActivity(intentturksauroposei);
            }
        });
        mamenchisaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkmamenc=new Intent(TurkishActivity.this,turkmamenchiActivity.class);
                startActivity(intentturkmamenc);
            }
        });
        plateosaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkplateo=new Intent(TurkishActivity.this,turkplateoActivity.class);
                startActivity(intentturkplateo);
            }
        });
        amargasaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkamargasau=new Intent(TurkishActivity.this,turkamargasaurusActivity.class);
                startActivity(intentturkamargasau);
            }
        });
        eoraptor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkeo=new Intent(TurkishActivity.this,turkeoraptorActivity.class);
                startActivity(intentturkeo);
            }
        });
        ornithomimus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkornithomimus=new Intent(TurkishActivity.this,turkornithomimusActivity.class);
                startActivity(intentturkornithomimus);
            }
        });
        nyasasaurus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturknyasa=new Intent(TurkishActivity.this,turknyasasaurusActivity.class);
                startActivity(intentturknyasa);
            }
        });

        dinazorresimleri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentturkresim=new Intent(TurkishActivity.this,TurkishİmagesActivity.class);
                startActivity(intentturkresim);
            }
        });












































































































































































































































































































































































    }
}
