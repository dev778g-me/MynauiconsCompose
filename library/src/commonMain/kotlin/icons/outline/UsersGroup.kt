package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.UsersGroup: ImageVector
    get() {
        if (_UsersGroup != null) {
            return _UsersGroup!!
        }
        _UsersGroup = ImageVector.Builder(
            name = "Outline.UsersGroup",
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
                moveTo(17f, 19.5f)
                curveToRelative(0f, -1.657f, -2.239f, -3f, -5f, -3f)
                reflectiveCurveToRelative(-5f, 1.343f, -5f, 3f)
                moveToRelative(14f, -3f)
                curveToRelative(0f, -1.23f, -1.234f, -2.287f, -3f, -2.75f)
                moveTo(3f, 16.5f)
                curveToRelative(0f, -1.23f, 1.234f, -2.287f, 3f, -2.75f)
                moveToRelative(12f, -4.014f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, -4.472f)
                moveTo(6f, 9.736f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4.472f)
                moveToRelative(2f, 8.236f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
            }
        }.build()

        return _UsersGroup!!
    }

@Suppress("ObjectPropertyName")
private var _UsersGroup: ImageVector? = null
