package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Exclude: ImageVector
    get() {
        if (_Exclude != null) {
            return _Exclude!!
        }
        _Exclude = ImageVector.Builder(
            name = "Outline.Exclude",
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
                moveTo(8.4f, 15.6f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2.4f)
                moveToRelative(-7.2f, 7.2f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-6.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-2.4f)
                moveToRelative(-7.2f, 7.2f)
                verticalLineToRelative(-1.8f)
                moveToRelative(0f, 1.8f)
                horizontalLineToRelative(1.8f)
                moveToRelative(5.4f, -7.2f)
                horizontalLineToRelative(-1.8f)
                moveToRelative(1.8f, 0f)
                verticalLineToRelative(1.8f)
                moveToRelative(-7.2f, 0f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, -1.8f)
                moveToRelative(5.4f, 5.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, 1.8f)
            }
        }.build()

        return _Exclude!!
    }

@Suppress("ObjectPropertyName")
private var _Exclude: ImageVector? = null
