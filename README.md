   # Kelime Oyunu


     Web Geliştirme Projesi 

<i>Şeyma Nur MUTLU ve Melike OĞUZ


Kocaeli Üniversitesi Bilgisayar Mühendisliği</i>

### ÖZET

**<i>“Kelime Oyunu Projesi" adlı program,
userları içinde barındıran bir sistem ile
çalışmaktadır.Programa üye olan kullanıcilar
kendileri arasinda oyundan aldıkları puana
gore siralanmaktadir.</i>**

    GİRİŞ

**Kelime Oyunu** projesinde, istenildiği sayıda
**kullanıcı** bulunmaktadır. Kullanıcılar
sisteme giriş yaptıktan sonra oyunu
oynayabilmektedir. Sistem dinamik bir
şekilde çalışmaktadır.

* Öncelikle kullanıcı login sayfasını
kullanarak sisteme giriş yapmalıdır. Daha
sonra her kullanıcı için aynı gelen
StartActivity ekranında kullanıcının
seçebileceği 4 adet eylem yer almaktadır;
<b>Start, Last Game, High Score ve Exit</b>

* Kullanıcı uygulamaya giriş yapmak
istediğinde bir kullanıcı adı ve 6
karakterden uzun bir parola belirlemelidir.


* Başarılı bir şekilde giriş yapıldıktan sonra,
kullanıcı <code>Start</code> butonuna bastığında ilk
oyundaki 1.seviyeye ait **6 oyun ekranından**
bir tanesi rastgele seçilerek gelmektedir.
Oyuncu bir oyunu tamamlamadan diğerine
geçemez ve aynı şekilde bir seviyeyi
tamamlamadan diğer seviyeye geçemez.


* Oyuncu, oyun ekranına girdiğinde
bulmacadaki kelimeleri oluşturan harfleri
görüntüler ve harflere tek tek tıklayarak
istediği kelimeyi yazabilir. Eğer yazdığı kelime
bulmacada tanımlı ise ekranın yukarısında
yer alan matris’e kelime yazılır. Tanımlı
değilse puan hesabına katılır.

* Oyun ekranında <code>6x6lık bir matris alanı</code>
tanımlanmıştır ve her seviyede
tanımlanmış kelimelere göre bu matrisin
bir kısmı oyunculara gösterilir. Tanımlı
kelimeler oyuncu tarafından bulunduğunda
bu matrislerin içi harfler ile doldurulur.

* Oyuncu oyun ekranında **restart** ve **pause**
işlemleri yapabilir. Restart işlemi yuvarlak
bir ok şeklinde olup ekranın sol tarafında
bulunmaktadır. Ekranı dinamik olarak
yeniden yükler ve puanı tekrar hesaplar.
Pause işlemi ise oyun ekranında o ana
kadar yapılmış tüm işlemleri bir Shared
Preference’a kaydeder.

* <code>High Score Ekranında</code> ise kullanıcıların
aldıkları en yüksek puanlar
görüntülenebilir.

* Exit butonuna basınca kullanıcıya **“Do you
want to exit ?”** sorusu sorulur ve kullanıcı
uygulamadan çıkış yapabilir.


    2- Temel Bilgiler

* Program, Java programlama dilinde ve
**“Android Studio 3.6.3’te”** yazılmıştır.

  Programın yazılım sürecinde git versiyon
kontrol sistemi olarak GitHub kullanılmış
olup, kodlarımızın gizliliği için GitHub
Education hesabımızın bize sağlamış
olduğu <code>private repository</code> özelliğinden
faydalanılmıştır.

 

    3- Tasarım

* Kelime Oyunu Uygulaması Projesi
aşağıdaki başlıklar altında geliştirilmiştir.

      3.1 Hiyerarşik Yapı 

  Giriş ekranı ve kullanılar için oyun
arayüzleri ve en yüksek puanı görünteleme
arayüzü oluşturulmuştur.

      3.2 Sayfaların Özellikleri 

  **LoginActivity (java):** Oyun ekranına erişmek
için gerekli olan kullanıcı adı ve parola
bilgilerinin alındığı java classıdır.

  **LoggedInUser (java):** Kullanıcının giriş
yaptığında görüntülediği ilk arayüzdür,
buradan erişmek istediği sayfaları seçebilir.

  **LoggedInUserview (java):** Uygulamaya giriş
yapan kullanıcının ekranda kullanıcı adının
görünmesini sağlar.

  **StartActivity (java):** Kullanıcının uygulamaya
giriş yaptığında karşılacağı ilk ekrandır ve bu
ekran üzerinden yapacağı işlemi seçer. Tanımlı
işlemler Start, Last Game, High Score ve Exit
olmak üzere 4 ana işlemdir.

  **Score Activity (java) :** Kayıtlı olan
kullanıcıların sahip olduğu en yüksek
puanlar listelenmektedir.

  **NextActivity (java):** Oyun esnasında yeni bir
sayfaya geçiş yapılmasını sağlar.


    4- Karşılaşılan Sorunlar ve Çözümleri
    
<h5>4.1- Harflerin Ekrandan Seçimi</h5>
Java’da bulunan onClick methodu ile harfleri tek tek
sırayla seçerek kelime yazılır, kelime doğru ise ekranda harfler belirir. Ekrandaki harflere sürükle bırak metoduyla basma sağlanılmadığı için harflere <code>onClickListener</code> özelliği aktive edilmiştir. Daha sonra bu harfler arraylistte toplanmıştır. Kullanıcı harf girişimini tamamladığında <code>textView</code> üzerinden kelimesini görür ve butona basar. Bu şekilde problem çözülmüştür.

<h5>4.2- Pause Seçeneği Seçildiğinde Mevcut Durumun
Kaydedilmesi </h5>
Shared Prefence kullanarak
mevcut durumu bir data modele kaydedip
devam edilmek istendiğinde geri yüklenir.


    5- Kazanımlar
    
 * Java ArrayList sınıfını iyice anlayıp
tanımak ,
* Android Studio’nun yeni sürümü olan
Android Studio 3.6.3’te proje geliştirmek,
* Mobil platform için geliştirme yapmak,
* Shared Preference kullanımı ,
* Dinamik bir sistem oluşturmak,
* Git sürümleri
* GitHub kullanımı,


    6- Ekran Görüntüleri

<img src="https://static.wixstatic.com/media/9e686e_60127d1e28f1479fbfb0da862e1f9e12~mv2.jpg"
     style="float: left; height:50px; width:30px" />

<img src="https://static.wixstatic.com/media/9e686e_9a0344d047da4fbe919365a016d8755e~mv2.jpg"
     style="float: left;margin-left:15px; height:500px; width:300px" />
<img src="https://static.wixstatic.com/media/9e686e_72621f8e52864201b988e1be1d24af3e~mv2.jpg"
     style="float: left; margin-top:45px; height:500px; width:300px" />     
     
<img src="https://static.wixstatic.com/media/9e686e_24f1a97f749647a88725203f44c6597d~mv2.jpg"
     style="float: left;margin-top:45px; margin-left:15px;  height:500px; width:300px" />

<img src="https://static.wixstatic.com/media/9e686e_2f167eea6a8549acb6596df3041ccde3~mv2.jpg"
     style="float: left;margin-top:45px; height:500px; width:300px" />
     
<img src="https://static.wixstatic.com/media/9e686e_8cb8845caddd4f779b6053e900744b20~mv2.jpg"
     style="float: left; margin-top:45px; margin-left:15px; height:500px; width:300px" />

<img src="https://static.wixstatic.com/media/9e686e_c236a166e5ae43698484df246ad6c929~mv2.jpg"
     style="float: left; margin-top:45px; height:500px; width:300px" />
     
<img src="https://static.wixstatic.com/media/9e686e_b16e6f98e082415d9140ce446f0f7d92~mv2.jpg"
     style="float: left;margin-top:45px; margin-left:15px;  height:500px; width:300px" />

</br>

    7- Pseudo Kod

<b>1-</b> Word Game uygulamasını cihaz üzerinden
aç.

<b>2-</b> Kullanıcı olarak kullanıcı adı ve 6
karakterden uzun parola ile giriş yap.

<b>3-</b> Kullanıcın önüne gelen ekrandan (6.2)
yapacağı işlemi seçmesi.

**4-** Kullanıcı Start’ı seçerse gelen oyun
ekranından harfleri seçerek kelime oluştur
kelime doğruysa bulmacaya yerleştir ve puana ekle kelime bulmacada yok ise puan
hesaplamasına kaydet.

**5-** Oyun ekranında Restart butonuna tıklanırsa
tekrardan ekranı dinamik sekilde yukle.

**6-** Oyun ekranında Pause butonuna tıklanırsa
oyunu durdur.

**7-** High Score ekranını açarsa puan
siralamasini göster.

**8-** Exit butonuna basarsa uygulamayı
sonlandır.

    8- Kaynakça

**[1]** https://stackoverflow.com/questions/7145606/how-android-sharedpreferences-save-store-object

**[2]** https://developer.android.com/training/gestures/detector

**[3]** https://developer.android.com/training/gestures/viewgroup

