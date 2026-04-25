import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 3000,      // On force un port connu et généralement ouvert (3000)
    strictPort: true, // Si 3000 est pris, il crashera au lieu de chercher au hasard
    host: '127.0.0.1' // On force IPv4 au lieu d'IPv6 (contourne l'erreur ::1)
  }
})