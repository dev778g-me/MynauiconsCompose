package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FolderOff: ImageVector
    get() {
        if (_FolderOff != null) {
            return _FolderOff!!
        }
        _FolderOff = ImageVector.Builder(
            name = "Outline.FolderOff",
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
                moveToRelative(3f, 21f)
                lineToRelative(1.177f, -1.177f)
                moveTo(21f, 3f)
                lineToRelative(-4f, 4f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-0.293f, 0f, -0.572f, -0.063f, -0.823f, -0.177f)
                moveTo(17f, 7f)
                lineTo(4.177f, 19.823f)
                moveTo(3f, 16.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1.745f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.322f, 0.5f)
                lineToRelative(2.272f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.322f, 0.5f)
                horizontalLineTo(13f)
            }
        }.build()

        return _FolderOff!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOff: ImageVector? = null
