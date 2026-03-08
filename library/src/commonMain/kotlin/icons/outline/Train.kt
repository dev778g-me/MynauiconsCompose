package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Train: ImageVector
    get() {
        if (_Train != null) {
            return _Train!!
        }
        _Train = ImageVector.Builder(
            name = "Outline.Train",
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
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                moveToRelative(8f, 0f)
                lineToRelative(2f, 3f)
                moveToRelative(-2f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-4f)
                moveTo(8f, 18f)
                lineToRelative(-2f, 3f)
                moveToRelative(2f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-4f)
                moveToRelative(3f, 3f)
                verticalLineToRelative(1f)
                moveToRelative(8f, -1f)
                verticalLineToRelative(1f)
                moveTo(5f, 11f)
                horizontalLineToRelative(7f)
                moveToRelative(-7f, 0f)
                verticalLineTo(6f)
                moveToRelative(7f, 5f)
                horizontalLineToRelative(7f)
                moveToRelative(-7f, 0f)
                verticalLineTo(6f)
                moveToRelative(7f, 5f)
                verticalLineTo(6f)
                moveToRelative(-7f, 0f)
                horizontalLineTo(5f)
                moveToRelative(7f, 0f)
                horizontalLineToRelative(7f)
                moveTo(5f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _Train!!
    }

@Suppress("ObjectPropertyName")
private var _Train: ImageVector? = null
