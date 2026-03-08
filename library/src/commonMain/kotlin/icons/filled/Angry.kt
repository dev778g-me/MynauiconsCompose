package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Angry: ImageVector
    get() {
        if (_Angry != null) {
            return _Angry!!
        }
        _Angry = ImageVector.Builder(
            name = "Filled.Angry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, 5.385f, 4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                reflectiveCurveTo(2.25f, 6.615f, 2.25f, 12f)
                moveToRelative(5.08f, -4.335f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.005f, -0.336f)
                lineToRelative(3f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, 1.342f)
                lineToRelative(-0.416f, -0.208f)
                verticalLineToRelative(0.537f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, -0.621f)
                lineTo(7.666f, 8.67f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.336f, -1.006f)
                moveToRelative(9.005f, 1.006f)
                lineToRelative(-1.415f, 0.708f)
                curveToRelative(0.199f, 0.134f, 0.33f, 0.362f, 0.33f, 0.621f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.537f)
                lineToRelative(-0.415f, 0.208f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.67f, -1.342f)
                lineToRelative(3f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.67f, 1.342f)
                moveToRelative(-7.782f, 6.727f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.25f)
                curveToRelative(1.285f, 0f, 2.474f, 0.427f, 3.447f, 1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.894f, 1.204f)
                arcTo(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15.75f)
                arcToRelative(4.27f, 4.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.553f, 0.852f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.894f, -1.204f)
            }
        }.build()

        return _Angry!!
    }

@Suppress("ObjectPropertyName")
private var _Angry: ImageVector? = null
