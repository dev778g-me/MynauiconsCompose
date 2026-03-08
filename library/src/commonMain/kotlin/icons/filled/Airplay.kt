package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Airplay: ImageVector
    get() {
        if (_Airplay != null) {
            return _Airplay!!
        }
        _Airplay = ImageVector.Builder(
            name = "Filled.Airplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.452f, 15.336f)
                arcToRelative(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.904f, 0f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.476f, 0.345f)
                curveToRelative(-0.093f, 0.102f, -0.191f, 0.232f, -0.286f, 0.357f)
                lineTo(8.39f, 19.187f)
                curveToRelative(-0.152f, 0.2f, -0.296f, 0.39f, -0.399f, 0.552f)
                curveToRelative(-0.1f, 0.16f, -0.24f, 0.413f, -0.241f, 0.728f)
                curveToRelative(0f, 0.376f, 0.162f, 0.742f, 0.458f, 0.991f)
                curveToRelative(0.252f, 0.212f, 0.55f, 0.257f, 0.734f, 0.274f)
                curveToRelative(0.189f, 0.018f, 0.422f, 0.018f, 0.665f, 0.018f)
                horizontalLineToRelative(4.787f)
                curveToRelative(0.242f, 0f, 0.475f, 0f, 0.664f, -0.018f)
                curveToRelative(0.184f, -0.017f, 0.482f, -0.062f, 0.734f, -0.274f)
                curveToRelative(0.296f, -0.248f, 0.458f, -0.615f, 0.458f, -0.991f)
                curveToRelative(0f, -0.315f, -0.141f, -0.568f, -0.241f, -0.728f)
                curveToRelative(-0.103f, -0.163f, -0.247f, -0.351f, -0.4f, -0.552f)
                lineToRelative(-2.395f, -3.149f)
                curveToRelative(-0.095f, -0.125f, -0.193f, -0.255f, -0.286f, -0.357f)
                curveToRelative(-0.1f, -0.11f, -0.253f, -0.257f, -0.476f, -0.345f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(9f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18.75f)
                horizontalLineToRelative(0.6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 15f)
                verticalLineTo(6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3.75f)
                horizontalLineToRelative(12f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 6f)
                verticalLineToRelative(9f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17.25f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 15f)
                verticalLineTo(6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2.25f)
                close()
            }
        }.build()

        return _Airplay!!
    }

@Suppress("ObjectPropertyName")
private var _Airplay: ImageVector? = null
