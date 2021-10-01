import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Mission } from 'src/app/dto/mission';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root',
})
export class MissionService {

    url: string = environment.apiUrl + "missions/";

    constructor(private http: HttpClient) { }

    getMissions(): Observable<Mission[]> {
        return this.http.get<Mission[]>(this.url);
    }

    getMission(id: number): Observable<Mission> {
        return this.http.get<Mission>(this.url + id);
    }

}