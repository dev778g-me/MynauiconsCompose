package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Dollar: ImageVector
    get() {
        if (_Dollar != null) {
            return _Dollar!!
        }
        _Dollar = ImageVector.Builder(
            name = "Outline.Dollar",
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
                moveTo(17f, 5f)
                horizontalLineToRelative(-5f)
                moveToRelative(0f, 0f)
                horizontalLineTo(9.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 7f)
                horizontalLineTo(12f)
                moveToRelative(0f, -7f)
                verticalLineTo(3f)
                moveToRelative(0f, 2f)
                verticalLineToRelative(7f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 7f)
                horizontalLineTo(12f)
                moveToRelative(0f, -7f)
                verticalLineToRelative(7f)
                moveToRelative(0f, 0f)
                horizontalLineTo(6f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(2f)
            }
        }.build()

        return _Dollar!!
    }

@Suppress("ObjectPropertyName")
private var _Dollar: ImageVector? = null
