package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Outline.Radio",
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
                moveTo(12f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveToRelative(-3.449f, 2.205f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.148f, -1.7f)
                arcToRelative(5.19f, 5.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.148f, -5.71f)
                moveTo(18.07f, 5.5f)
                arcToRelative(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.719f, 6.5f)
                arcToRelative(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.72f, 6.5f)
                moveTo(15.24f, 8.295f)
                arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.148f, 1.7f)
                arcToRelative(5.19f, 5.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.148f, 5.71f)
                moveTo(5.512f, 18.5f)
                arcTo(9.15f, 9.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.793f, 12f)
                curveToRelative(0f, -2.438f, 0.978f, -4.776f, 2.72f, -6.5f)
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
