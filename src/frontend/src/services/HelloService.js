import Api from '@/services/Api'

export default {
  hello () {
    return Api().get('/api/welcome')
  }
}
