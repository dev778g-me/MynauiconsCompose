package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudSun: ImageVector
    get() {
        if (_CloudSun != null) {
            return _CloudSun!!
        }
        _CloudSun = ImageVector.Builder(
            name = "Outline.CloudSun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.882f, 20.257f)
                curveToRelative(2.793f, -2.337f, -0.163f, -5.47f, -3.232f, -5.47f)
                curveToRelative(-2.162f, -8.209f, -14.847f, -1.419f, -9.226f, 4.769f)
                moveTo(15f, 3f)
                verticalLineToRelative(1.059f)
                moveTo(21f, 9f)
                horizontalLineToRelative(-1.059f)
                moveToRelative(-0.706f, -4.235f)
                lineToRelative(-0.706f, 0.706f)
                moveToRelative(-7.764f, -0.706f)
                lineToRelative(0.705f, 0.706f)
                moveToRelative(7.765f, 7.764f)
                lineToRelative(-0.706f, -0.706f)
                moveTo(15.895f, 11f)
                arcTo(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9.122f)
                curveTo(17f, 7.95f, 16.075f, 7f, 14.933f, 7f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8.37f)
            }
        }.build()

        return _CloudSun!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSun: ImageVector? = null
