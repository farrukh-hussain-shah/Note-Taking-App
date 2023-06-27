package com.example.room.adaptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0013\u0014\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/room/adaptors/NoteAdaptor;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/room/Note;", "Lcom/example/room/adaptors/NoteAdaptor$NoteViewHolder;", "listener", "Lcom/example/room/adaptors/NoteAdaptor$OnClickListener;", "(Lcom/example/room/adaptors/NoteAdaptor$OnClickListener;)V", "getListener", "()Lcom/example/room/adaptors/NoteAdaptor$OnClickListener;", "getNoteAt", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "NoteViewHolder", "OnClickListener", "app_debug"})
public final class NoteAdaptor extends androidx.recyclerview.widget.ListAdapter<com.example.room.Note, com.example.room.adaptors.NoteAdaptor.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.room.adaptors.NoteAdaptor.OnClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.room.adaptors.NoteAdaptor.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.room.Note> DIFF_CALLBACK = null;
    
    public NoteAdaptor(@org.jetbrains.annotations.NotNull()
    com.example.room.adaptors.NoteAdaptor.OnClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.room.adaptors.NoteAdaptor.OnClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.room.adaptors.NoteAdaptor.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.room.adaptors.NoteAdaptor.NoteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.room.Note getNoteAt(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/room/adaptors/NoteAdaptor$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/room/adaptors/NoteAdaptor;Landroid/view/View;)V", "textViewDescription", "Landroid/widget/TextView;", "getTextViewDescription", "()Landroid/widget/TextView;", "textViewPriority", "getTextViewPriority", "textViewTitle", "getTextViewTitle", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewDescription = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textViewPriority = null;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextViewPriority() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/room/adaptors/NoteAdaptor$OnClickListener;", "", "onClick", "", "note", "Lcom/example/room/Note;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        com.example.room.Note note);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/room/adaptors/NoteAdaptor$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/room/Note;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}