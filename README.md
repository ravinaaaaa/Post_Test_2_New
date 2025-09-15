# Post_Test_2
Ravina Eka Adiya 2409116078

## Penjelasan Singkat Program
Tujuan dari tema "Sistem Manajemen Daftar Destinasi Wisata Kota Jogja" adalah untuk menyediakan sarana pengelolaan informasi destinasi wisata di kota Jogja agar data lebih terorganisir, memudahkan pencarian informasi serta membantu pengguna dalam mengetahui daftar tempat wisata beserta detail harga tiketnya.

#

### 1. destinasi.java
<img width="422" height="108" alt="image" src="https://github.com/user-attachments/assets/1e570edc-17cd-49f8-b8b5-2da1175269cc" />

membuat class destinasi dengan akses public di package model.

<img width="462" height="104" alt="image" src="https://github.com/user-attachments/assets/1e21c3ee-26be-44bb-8d5b-b9752075681c" />

membuat tiga atribut yang dimiliki setiap objek destinasi :
- namaDestinasi : menyimpan nama tempat wisata.
- tiketDewasa : menyimpan haarga tiket untuk pengunjung dewasa.
- tiketAnak : menyimpan harga tiket untuk anak-anak.

<img width="1176" height="174" alt="image" src="https://github.com/user-attachments/assets/12d36682-f5e8-48a2-b81d-d987c8ff0eff" />

contructor dipanggil saat membuat objek baru di class destinasi : 
- this.namaDestinasi = namaDestinasi : menyimpan nilai yang dikirim ke parameter ke dalam atribut kelas.
- this.tiketDewasa = tiketDewasa : menyimpan harga tiket dewasa.
- this.tiketAnak = tiketAnak : menyimpan harga tiket anak.

#

### 2. service.java
<img width="450" height="232" alt="image" src="https://github.com/user-attachments/assets/54b317cd-e47e-40e6-9ed6-d58ae987ed8c" />

membuat class service di package service.
- import ArrayList : untuk menyimpan daftar destinasi wisata.
- import Scanner : untuk membaca input dari user.
- import model.destinasi : untuk memanggil class destinasi dari package model.

<img width="1060" height="72" alt="image" src="https://github.com/user-attachments/assets/ad3286c2-5825-4c50-91c0-16c1ee568d54" />

- daftarDestinasi adalah tempat untuk menyimpan data destinasi wisata.
- scanner dipakai untuk input dari pengguna.

<img width="1396" height="422" alt="image" src="https://github.com/user-attachments/assets/379dabb9-9f99-4eb7-9376-6347fb2b1533" />
constructor ini untuk otomatis jalan saat service dibuat, menambahkan 10 destinasi wisata jogja sebagai data awal.

<img width="1652" height="626" alt="image" src="https://github.com/user-attachments/assets/6f621caa-cc91-4b79-8619-6c0ad0f1a725" />
kode diatas untuk menampilkan semua data destinasi dalam bentuk tabel. jika data kosong maka akan ada pesan "Belum ada data destinasi".

<img width="986" height="396" alt="image" src="https://github.com/user-attachments/assets/ad5f67a0-fec7-406b-88a4-6ee9437d7175" />
kode diatas, pengguna bisa menambah data destinasi baru dengan menginput nama destinasi, harga tiket dewasa dan anak. setelah itu data dimasukkan ke ArrayList daftarDestinasi.

<img width="1044" height="728" alt="image" src="https://github.com/user-attachments/assets/55b523b5-6d21-4f48-8412-8463bb1283e0" />
kode diatas untuk mengubah data destinasi yang suda ada. langkah pertama data akan ditampilkan daftar destinasi, lalu pengguna memilih nomor destinasi yang mau di ubah. setelah itu pengguna bisa mengganti nama destinasi dan harga tiket.

<img width="1068" height="492" alt="image" src="https://github.com/user-attachments/assets/147f96f6-1ad3-4b51-bd30-20b89d5a5160" />
kode diatas ini menampilkan daftar destinasi, lalu pengguna bisa menghapus daftar destinasi yang ingin dihapus dengan memilih nomor datda destinasi nya. setelah itu data akan dihapus dari ArrayList.

<img width="1238" height="762" alt="image" src="https://github.com/user-attachments/assets/e776ac50-cbae-43c2-b1d1-f31575270ba9" />
kode diatas untuk mencari destinasi. program akan menampilkan daftar destinasi, lalu pengguna ketik nama destinasi yang ingin dicari, jikda tidak ada hasil maka akan ditampilkan "Destinasi tidak ditemukan".

<img width="860" height="318" alt="image" src="https://github.com/user-attachments/assets/ad3e6d2b-80a1-4eab-83a8-2924e3638c96" />
kode diatas digunakan untuk validasi input angka. jika pengguna salah ketik, program akan minta input ulang sampai inputan benar.

#

### 3. main.java
<img width="434" height="202" alt="image" src="https://github.com/user-attachments/assets/e764b50f-eb08-4957-b5c7-2f40afbae402" />

membuat class main di package main.
- import scanner : digunakan untuk membaca input dari user.
- import service.service : digunakan untuk memanggil class service dari package service.

<img width="670" height="36" alt="image" src="https://github.com/user-attachments/assets/13bc7869-e2c4-4264-ba4f-e429a0a0bc85" />

kode diatas adalah method utama untuk titik awal program berjalan.

<img width="686" height="112" alt="image" src="https://github.com/user-attachments/assets/83888c18-738c-479c-89f4-543637a9cffe" />

- scanner digunakan untuk membaca input user.
- service adalah objek dari class service, digunakan untuk menjalankan semua fitur CRUD dan pencarian.
- pilihan digunakan untuk menyimpan angka pilihan menu.

<img width="82" height="44" alt="image" src="https://github.com/user-attachments/assets/7a4b1770-66af-4ad0-89ff-c9c256041a6b" />
<img width="390" height="52" alt="image" src="https://github.com/user-attachments/assets/f57bcc51-022c-4a8d-8c40-ae959a71df95" />

kode diatas untuk menampilkan menu berulang-ulang selama pengguna tidak memilih menu keluar(6).

<img width="908" height="276" alt="image" src="https://github.com/user-attachments/assets/36fadde6-4eb1-47b9-b22b-f1cf9c32ec9e" />

kode diatas untuk menampilkan pilihan menu utama untuk pengguna, disini pengguna diminta untuk memasukan atau meng input angka sesuai yang tersedia di menu.

<img width="828" height="132" alt="image" src="https://github.com/user-attachments/assets/dc5d4e8b-739b-4c63-92d9-bf309b73ca46" />

kode diatas adalah jika pengguna salah memasukan inputan, semisal pengguna memasukkan huruf atau simbol, maka program akan minta pengguna untuk input ulang.

<img width="940" height="306" alt="image" src="https://github.com/user-attachments/assets/3691104e-c9f4-476d-8508-68f10df79d74" />

- case 1 untuk menampilkan daftar destinasi.
- case 2 untuk menambah destinasi baru.
- case 3 untuk mengubah data destinasi.
- case 4 untuk menghapus destinasi.
- case 5 untuk menghapus destinasi berdasarkan nama.
- case 6 keluar dari program.
- default jika user salah pilih menu.

<img width="280" height="44" alt="image" src="https://github.com/user-attachments/assets/10bedd0a-8742-4ff8-9738-1733cab072da" />

kode diatas untuk menutup scanner setelah program selesai.

#

### Output
<img width="488" height="284" alt="image" src="https://github.com/user-attachments/assets/266250a7-db71-4346-afd0-ce9fb1120f75" />

gambar diatas adalah ditampilkan pilihan Menu Utama.

<img width="1008" height="790" alt="image" src="https://github.com/user-attachments/assets/90633bee-6d8a-4991-9a18-65bec4c034c8" />

gambar diatas adalah menu untuk menampilkan seluruh daftar destinasi wisata.

<img width="528" height="420" alt="image" src="https://github.com/user-attachments/assets/50e47458-0a20-49ef-9dac-7da3c008c2ba" />

gambar diatas adalah menu untuk tambah destinasi wisata. pengguna memasukan nama destinasi, tiket dewasa dan anak yang baru.

<img width="1034" height="1002" alt="image" src="https://github.com/user-attachments/assets/d502e536-63c4-42be-8136-51d899dfafab" />

gambar diatas adalah menu untuk ubah destinasi wisata. pengguna memilih nomor destinasi yang mau di ubah, lalu pengguna memasukan nama dan harga baru.

<img width="1016" height="886" alt="image" src="https://github.com/user-attachments/assets/a724291d-9d7c-4bf3-8ce4-5c74d3d7abb9" />

gambar diatas adalah menu untuk hapus destinasi wisata. pengguna memilih nomor destinasi yang mau dihapus.

<img width="1032" height="904" alt="image" src="https://github.com/user-attachments/assets/08131c4d-ee8f-4465-b625-b35356b2a4b8" />

gambar diatas adalah menu untuk cari destinasi wisata sesuai kategori, semisal cari destinasi wisata Goa, tinggal ketik saja Goa maka akan muncul daftar destinasi wisata yang telah terdata.

<img width="506" height="320" alt="image" src="https://github.com/user-attachments/assets/bb6ee4be-6d02-4df2-a9c8-5cf19b6c006e" />

gambar diatas adalah menu untuk keluar dari program.
