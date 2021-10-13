# Selamat!! Anda sekarang sudah di UTS Praktikum Level 4 (Level Terakhir)
Baca instruksi yang diberikan dengan baik.


## Kelas Diagram
![Image of UTS Level 4](http://api.puro.del.ac.id/v1/file/3935b2e5636f8f3025ef292c80b9cd48)
>Silahkan menggunakan (menyalin) kode program yang sudah anda hasilkan dari level 3 dan modifikasi sehingga sesuai dengan kebutuhan level 4 ini. 

>**Perhatikan bahwa, pada level 4 ini, sejumlah kelas berelasi dengan interface MyInterface.**

>**Untuk mendapatkan nilai sempurna pada level ini, konsentrasi menyesuaikan kode program pada level 3 sehingga mempunyai relasi dengan interface MyInterface seperti yang ditunjukkan pada kelas diagram di atas.**


## Rubrik Penilaian 
1. **[Poin 20]** test realisasi relasi antara kelas Laptop dan MyInterface.
	
	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testInterfaceI

2. **[Poin 20]** test realisasi relasi antara kelas Prosesor dan MyInterface.

	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testInterfaceII

3. **[Poin 30]** test realisasi method clone() pada kelas Prosesor 

	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testCloneProsesor

4. **[Poin 30]** test realisasi method clone() pada kelas Laptop 

	
	> Perintah test: 
	
	
		>gradle test --tests TestLaptop.testCloneLaptop



**Catatan Penting:**
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Pada beberapa template program sudah disediakan method yang tidak boleh diubah. Maka jangan anda ubah!
