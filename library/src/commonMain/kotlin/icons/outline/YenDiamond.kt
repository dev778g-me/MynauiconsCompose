package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.YenDiamond: ImageVector
    get() {
        if (_YenDiamond != null) {
            return _YenDiamond!!
        }
        _YenDiamond = ImageVector.Builder(
            name = "Outline.YenDiamond",
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
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
                close()
                moveTo(15.182f, 12.5f)
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

        return _YenDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _YenDiamond: ImageVector? = null
