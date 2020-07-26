   # Kelime Oyunu


     Web Geliştirme Projesi 

<i>Şeyma Nur MUTLU ve Melike OĞUZ


Kocaeli Üniversitesi Bilgisayar Mühendisliği</i>

### ÖZET

**<i>“Kelime Oyunu Projesi" adlı program,
userları içinde barındıran bir sistem ile
çalışmaktadır.Programa üye olan kullanıcılar
kendileri arasında oyundan aldıkları puana
göre sıralanmaktadır.</i>**

    GİRİŞ

**Kelime Oyunu** projesinde, istenildiği sayıda
**kullanıcı** bulunmaktadır. Kullanıcılar
sisteme giriş yaptıktan sonra oyunu
oynayabilmektedir. Sistem dinamik bir
şekilde çalışmaktadır.

* Öncelikle kullanıcı login sayfasını
kullanarak sisteme giriş yapmalıdır. Daha
sonra her kullanıcı için aynı gelen
<ins>StartActivity</ins> ekranında kullanıcının
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


 <h3><ins>2- Temel Bilgiler</ins></h3>

* Program, Java programlama dilinde ve
**“Android Studio 3.6.3’te”** yazılmıştır.

  Programın yazılım sürecinde git versiyon
kontrol sistemi olarak GitHub kullanılmış
olup, kodlarımızın gizliliği için GitHub
Education hesabımızın bize sağlamış
olduğu <code>private repository</code> özelliğinden
faydalanılmıştır.

 

 <h3><ins>3- Tasarım</ins></h3>

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


 <h3><ins>4- Karşılaşılan Sorunlar ve Çözümleri</ins></h3>
    
<h5>4.1- Harflerin Ekrandan Seçimi</h5>
Java’da bulunan onClick methodu ile harfleri tek tek
sırayla seçerek kelime yazılır, kelime doğru ise ekranda harfler belirir. Ekrandaki harflere sürükle bırak metoduyla basma sağlanılmadığı için harflere <code>onClickListener</code> özelliği aktive edilmiştir. Daha sonra bu harfler arraylistte toplanmıştır. Kullanıcı harf girişimini tamamladığında <code>textView</code> üzerinden kelimesini görür ve butona basar. Bu şekilde problem çözülmüştür.

<h5>4.2- Pause Seçeneği Seçildiğinde Mevcut Durumun
Kaydedilmesi </h5>
Shared Prefence kullanarak
mevcut durumu bir data modele kaydedip
devam edilmek istendiğinde geri yüklenir.


 <h3><ins>5- Kazanımlar</ins></h3>
    
 * Java ArrayList sınıfını iyice anlayıp
tanımak ,
* Android Studio’nun yeni sürümü olan
Android Studio 3.6.3’te proje geliştirmek,
* Mobil platform için geliştirme yapmak,
* Shared Preference kullanımı ,
* Dinamik bir sistem oluşturmak,
* Git sürümleri
* GitHub kullanımı,



 <h3><ins>6- Ekran Görüntüleri</ins></h3>
    
    
<img src="https://static.wixstatic.com/media/9e686e_96a8eb37dab9496795dd0c9b0b19e48f~mv2.jpg"
     style="float: left; height:50px; width:30px" />

<img src="https://static.wixstatic.com/media/9e686e_c403842fa78548bc8d59e3cfaf91f564~mv2.jpg"
     style="float: right; height:50px; width:30px" />

<img src="https://static.wixstatic.com/media/9e686e_83b74f8009b249aa99a69b3dbc8d17a9~mv2.jpg"
     style="float: left;margin-left:15px; height:500px; width:300px" />
     
<img src="https://static.wixstatic.com/media/9e686e_ec487a9dd2934758b248919fdd4ccb3f~mv2.jpg"
     style="float: left; margin-top:45px; height:500px; width:300px" />     
     
<img src="https://static.wixstatic.com/media/9e686e_0392f67c152f4af5bd4c52b1dbfae0f9~mv2.jpg"
     style="float: left;margin-top:45px; margin-left:15px;  height:500px; width:300px" />

<img src="https://static.wixstatic.com/media/9e686e_4252d52f756546babf6e72c7fe633b52~mv2.jpg"
     style="float: left;margin-top:45px; height:500px; width:300px" />
     
<img src="https://static.wixstatic.com/media/9e686e_e04c36ea0766470189b7c79f0ccaa916~mv2.jpg"
     style="float: left; margin-top:45px; margin-left:15px; height:500px; width:300px" />

<img src="https://static.wixstatic.com/media/9e686e_a651ad22ce7a4bdea58b4b8b4f826e99~mv2.jpg"
     style="float: left; margin-top:45px; height:500px; width:300px" />
     

</br>

 <h3><ins>7- Pseudo Kod</ins></h3>

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


