package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) {
            return _Puzzle!!
        }
        _Puzzle = ImageVector.Builder(
            name = "Filled.Puzzle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.8f, 5.7f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.9f, 0f)
                curveToRelative(0f, 0.083f, 0.067f, 0.15f, 0.15f, 0.15f)
                horizontalLineToRelative(1.576f)
                curveToRelative(0.258f, 0f, 0.494f, 0f, 0.692f, 0.016f)
                curveToRelative(0.213f, 0.018f, 0.446f, 0.057f, 0.677f, 0.175f)
                curveToRelative(0.329f, 0.168f, 0.596f, 0.435f, 0.764f, 0.765f)
                curveToRelative(0.118f, 0.23f, 0.157f, 0.463f, 0.175f, 0.676f)
                curveToRelative(0.016f, 0.198f, 0.016f, 0.434f, 0.016f, 0.692f)
                verticalLineToRelative(2.252f)
                curveToRelative(0f, 0.258f, 0f, 0.494f, -0.016f, 0.692f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.175f, 0.676f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.765f, 0.765f)
                curveToRelative(-0.23f, 0.118f, -0.463f, 0.158f, -0.676f, 0.175f)
                curveToRelative(-0.198f, 0.016f, -0.434f, 0.016f, -0.692f, 0.016f)
                horizontalLineTo(19.2f)
                arcToRelative(1.95f, 1.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3.9f)
                horizontalLineToRelative(0.226f)
                curveToRelative(0.258f, 0f, 0.494f, 0f, 0.692f, 0.016f)
                curveToRelative(0.213f, 0.017f, 0.446f, 0.057f, 0.677f, 0.175f)
                curveToRelative(0.329f, 0.168f, 0.596f, 0.435f, 0.764f, 0.764f)
                curveToRelative(0.118f, 0.23f, 0.157f, 0.464f, 0.175f, 0.677f)
                curveToRelative(0.016f, 0.198f, 0.016f, 0.434f, 0.016f, 0.692f)
                verticalLineToRelative(0.452f)
                curveToRelative(0f, 0.258f, 0f, 0.494f, -0.016f, 0.692f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.175f, 0.677f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.765f, 0.764f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.676f, 0.175f)
                curveToRelative(-0.198f, 0.016f, -0.434f, 0.016f, -0.692f, 0.016f)
                horizontalLineTo(9.074f)
                curveToRelative(-0.258f, 0f, -0.494f, 0f, -0.692f, -0.016f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.676f, -0.175f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.765f, -0.765f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.175f, -0.676f)
                curveToRelative(-0.016f, -0.198f, -0.016f, -0.434f, -0.016f, -0.692f)
                verticalLineTo(19f)
                curveToRelative(0f, -0.292f, 0f, -0.467f, -0.011f, -0.596f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.018f, -0.12f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.104f, -0.105f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.121f, -0.018f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.596f, -0.011f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -6.9f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.292f, 0f, 0.467f, 0f, 0.596f, -0.011f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, -0.018f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.105f, -0.104f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.018f, -0.121f)
                curveToRelative(0.01f, -0.13f, 0.011f, -0.304f, 0.011f, -0.596f)
                verticalLineTo(8.174f)
                curveToRelative(0f, -0.258f, 0f, -0.494f, 0.016f, -0.692f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.175f, -0.676f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.765f, -0.765f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.676f, -0.175f)
                curveToRelative(0.198f, -0.016f, 0.434f, -0.016f, 0.692f, -0.016f)
                horizontalLineToRelative(1.576f)
                arcToRelative(0.15f, 0.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, -0.15f)
            }
        }.build()

        return _Puzzle!!
    }

@Suppress("ObjectPropertyName")
private var _Puzzle: ImageVector? = null
