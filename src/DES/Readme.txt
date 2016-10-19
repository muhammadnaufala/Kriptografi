Penjelasan singkat setiap method:

1. teksToBiner
Pada method ini berfungsi untuk mengubah plainteks (sebagai parameter) menjadi binary dengan cara mengubah setiap karater menjadi byte yang disimpan ke array infobiner yang nantinya akan di ubah ke binary dengan format string 8 karakter. Karena huruf a-z terbaca 6 bit sehingga perlu mengganti 2 karakter sisa (spasi) menjadi 0

2. makeBlocks
Pada method ini menerima 2 parameter yaitu deretan binary yang akan dipecah dan panjang/ukuran setiap bloknya. Apabila suatu blok tidak penuh atau kurang dari ukuran bloknya maka akan ditambahkan bit 11111111 sampai penuh.

3. permutation
Pada method ini berfungsi untuk melakukan permutasi dengan menerima 2 parameter yaitu string yang akan dilakukan permutasi dan matriks permutasi. Pada java kita tidak bisa memanipulasi string sehingga kita membuat variabel baru yaitu plainBinerBlockPermutation untuk menampun hasil permutasi.

4. getLeftBiner getLeftKeyBiner
untuk mendapatkan sisi kiri dari sekumpulan string binary dengan memanfaatkan method substring

5. getRightBiner getRightKeyBiner
untuk mendapatkan sisi kanan dari sekumpulan string binary dengan memanfaatkan method substring

6. leftShift
untuk menggeser ke kiri suatu binary

7. expand
Melakukan ekspansi dengan melakukan permutasi dengan matriks permutasi

8. xor
Melakukan operasi XOR pada setiap bit. Dengan menggunakan fungsi compareTo dengan mudah dapat melakukan operasi XOR karena pada intinya XOR bernilai 1 jika beda, dan bernilai 0 jika sama. Namun pada method compareTo menghasilkan tanda "-" sehingga perlu di replace untuk menghilangkan tanda tersebut

9. sBox
Kita akan memecah keyBiner menjadi blok dengan ukuran 6 bit. pada blok tersebut nantinya akan diambil 2 bit awal dan akhir untuk di konversi menjadi decimal sebagai baris, dan sisannya sebagai kolom

10. encrypt
fungsi utama enkripsi DES. Pada method ini berisi sekumpulan method-method yang telah dibuat diawal. Diawali dari menggunakan method teksToBiner untuk mengubah plainteks menjadi binary. Setelah itu kita gunakan method makeBlocks untuk memecah binary tersebut menjadi blok dengan ukuran 64 bit. Lalu melakukan inisialisasi sbox dengan initSboxes. Langkah selanjutnya mengeluarkan setiap bloknya untuk dilakukan enkripsi