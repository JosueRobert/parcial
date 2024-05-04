package com.ugb.controlesbasicos;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {
    private static final String dbname = "Villegas";
    private static final int v =1;
    private static final String SQLdb = "CREATE TABLE Villegas(id text, rev text, idAmigo text, " +
            "nombre text, descripcion text, marca text, presentacion text, precio text, foto text, stock text, costo text)";
    public DB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbname, factory, v);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLdb);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //cambiar estructura de la BD
    }
    public String administrar_amigos(String accion, String[] datos){
        try {
            SQLiteDatabase db = getWritableDatabase();
            String sql = "";
            if( accion.equals("nuevo") ){
                sql = "INSERT INTO Villegas(id,rev,idAmigo,nombre,descripcion,marca,presentacion,precio,foto,stock,costo) VALUES('"+ datos[0] +"','"+ datos[1] +"','"+ datos[2] +"', '"+
                        datos[3] +"', '"+ datos[4] +"','"+ datos[5] +"','"+ datos[6] +"', '"+ datos[7] +"', '"+ datos[8] +"','"+datos[9]+"','"+datos[10]+"' )";
            } else if (accion.equals("modificar")) {
                sql = "UPDATE Villegas SET id='"+ datos[0] +"',rev='"+ datos[1] +"',nombre='"+ datos[3] +"', descripcion='"+ datos[4] +"', marca='"+ datos[5] +"', presentacion=" +
                        "'"+ datos[6] +"', precio='"+ datos[7] +"', foto='"+ datos[8] +"', stock='"+datos[9]+"', costo'"+datos[10]+"' WHERE idAmigo='"+ datos[2] +"'";
            } else if (accion.equals("eliminar")) {
                sql = "DELETE FROM Villegas WHERE idAmigo='"+ datos[2] +"'";
            }
            db.execSQL(sql);
            return "ok";
        }catch (Exception e){
            return e.getMessage();
        }
    }
    public Cursor obtener_amigos(){
        Cursor cursor;
        SQLiteDatabase db = getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM Villegas ORDER BY nombre", null);
        return cursor;
    }
}