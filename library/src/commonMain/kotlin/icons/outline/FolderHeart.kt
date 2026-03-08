package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) {
            return _FolderHeart!!
        }
        _FolderHeart = ImageVector.Builder(
            name = "Outline.FolderHeart",
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
                moveTo(3f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1.745f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.322f, 0.5f)
                lineToRelative(2.272f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.322f, 0.5f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.62f, 12.024f)
                curveToRelative(0f, 1.972f, 3.38f, 4.226f, 3.38f, 4.226f)
                reflectiveCurveToRelative(3.38f, -2.254f, 3.38f, -4.226f)
                curveToRelative(0f, -1.88f, -2.55f, -2.454f, -3.38f, -0.798f)
                curveToRelative(-0.814f, -1.625f, -3.38f, -1.053f, -3.38f, 0.798f)
            }
        }.build()

        return _FolderHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHeart: ImageVector? = null
