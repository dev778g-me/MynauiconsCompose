package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.YenHexagon: ImageVector
    get() {
        if (_YenHexagon != null) {
            return _YenHexagon!!
        }
        _YenHexagon = ImageVector.Builder(
            name = "Outline.YenHexagon",
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
                moveTo(20.5f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.944f, -1.645f)
                lineToRelative(-6.612f, -3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.888f, 0f)
                lineToRelative(-6.612f, 3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 8.2f)
                verticalLineToRelative(7.602f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 1.644f)
                lineToRelative(6.612f, 3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.888f, 0f)
                lineToRelative(6.612f, -3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.8f)
                moveToRelative(-5.318f, -3.3f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.818f)
                moveToRelative(3.182f, 0f)
                lineToRelative(-3.5f, -5f)
                moveToRelative(3.5f, 5f)
                lineToRelative(3.5f, -5f)
                moveToRelative(-3.5f, 5f)
                verticalLineTo(15f)
                moveToRelative(3.182f, 0f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.818f)
                moveTo(12f, 15f)
                verticalLineToRelative(2.5f)
            }
        }.build()

        return _YenHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _YenHexagon: ImageVector? = null
