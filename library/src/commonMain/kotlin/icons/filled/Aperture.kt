package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Aperture: ImageVector
    get() {
        if (_Aperture != null) {
            return _Aperture!!
        }
        _Aperture = ImageVector.Builder(
            name = "Filled.Aperture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.726f, 8.104f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 12f)
                curveToRelative(0f, 1.002f, 0.179f, 1.962f, 0.506f, 2.85f)
                horizontalLineToRelative(4.366f)
                lineToRelative(-1.42f, -2.457f)
                lineToRelative(-0.019f, -0.034f)
                close()
                moveTo(4.111f, 6.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.088f, -0.12f)
                arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.837f, -3.846f)
                arcToRelative(9.76f, 9.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.924f, 5.844f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 12f)
                curveToRelative(0f, 2.141f, -0.69f, 4.122f, -1.86f, 5.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, 0.12f)
                arcToRelative(9.74f, 9.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.836f, 3.846f)
                arcToRelative(9.76f, 9.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.924f, -5.844f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                curveToRelative(0f, -2.142f, 0.69f, -4.122f, 1.86f, -5.73f)
                moveToRelative(1.549f, 0.451f)
                lineToRelative(2.182f, 3.78f)
                lineToRelative(1.425f, -2.468f)
                lineToRelative(0.008f, -0.015f)
                lineToRelative(2.463f, -4.264f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 6.721f)
                moveToRelative(7.743f, -2.852f)
                lineTo(11.22f, 7.65f)
                horizontalLineToRelative(7.792f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.609f, -3.781f)
                moveToRelative(6.341f, 5.281f)
                horizontalLineToRelative(-4.366f)
                lineToRelative(1.42f, 2.457f)
                lineToRelative(0.019f, 0.034f)
                lineToRelative(2.457f, 4.255f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 12f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.506f, -2.85f)
                moveToRelative(-1.404f, 8.129f)
                lineToRelative(-2.182f, -3.78f)
                lineToRelative(-3.896f, 6.747f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.078f, -2.967f)
                moveToRelative(-7.743f, 2.852f)
                lineToRelative(2.183f, -3.781f)
                horizontalLineTo(4.988f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.609f, 3.781f)
            }
        }.build()

        return _Aperture!!
    }

@Suppress("ObjectPropertyName")
private var _Aperture: ImageVector? = null
